package estudo.t16;

import estudo.t16.modelo.*;
import estudo.t16.repositorio.Repositorio;
import estudo.t16.servico.Servico;
import estudo.t16.excecao.OperacaoInvalidaException;

/** Testes executaveis sem JUnit. Lancam AssertionError em caso de falha. */
public class Teste {
    private interface Tentativa { void executar() throws OperacaoInvalidaException; }
    private static void erroEsperado(Tentativa tentativa) throws Exception {
        try { tentativa.executar(); }
        catch (OperacaoInvalidaException e) { return; }
        throw new AssertionError("Era esperada uma excecao de negocio");
    }
    private static void igual(double esperado, double obtido) {
        if (Math.abs(esperado - obtido) > 0.00001)
            throw new AssertionError("Esperado " + esperado + ", obtido " + obtido);
    }
    public static void main(String[] args) throws Exception {
        Servico s = new Servico(new Repositorio());
        igual(0, s.total()); igual(0, s.media());
        if (s.maior() != null) throw new AssertionError("Maior de vazio deve ser null");
        s.carregarExemplos();
        igual(200.0, s.buscar(1).calcularTotal());
        igual(230.0, s.buscar(2).calcularTotal());
        igual(200.0 + 230.0, s.total());
        igual((200.0 + 230.0) / 2, s.media());
        igual(Math.max(200.0, 230.0), s.maior().calcularTotal());
        igual(1, s.buscarPorResponsavel("ANA").size());
        int destaques = 0;
        for (Consumo r : s.listar()) if (r.getKwh() >= 200) destaques++;
        igual(destaques, s.filtrarDestaques().size());
        s.listar().clear(); igual(2, s.listar().size());
        erroEsperado(() -> s.carregarExemplos()); // Nao duplica nem altera parcialmente.
        igual(2, s.listar().size());
        erroEsperado(() -> s.cadastrar(1, 1, "Duplicado", "Ana", 0.8, 250));
        erroEsperado(() -> s.cadastrar(1, 3, " ", "Ana", 0.8, 250));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", " ", 0.8, 250));
        erroEsperado(() -> s.cadastrar(1, 0, "Teste", "Ana", 0.8, 250));
        erroEsperado(() -> s.cadastrar(3, 3, "Teste", "Ana", 0.8, 250));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", -1, 250));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.NaN, 250));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.POSITIVE_INFINITY, 250));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", 0.8, 0 - 1));
        erroEsperado(() -> s.buscar(999));
        erroEsperado(() -> s.remover(999));
        erroEsperado(() -> s.atualizar(1, 999, "Teste", "Ana", 0.8, 250));
        erroEsperado(() -> s.atualizar(1, 1, "Teste", "Ana", -1, 250));
        igual(200.0, s.buscar(1).calcularTotal()); // Falha manteve os dados anteriores.
        s.atualizar(2, 1, "Atualizado", "Ana Maria", 0.8, 250);
        igual(230.0, s.buscar(1).calcularTotal());
        if (!(s.buscar(1) instanceof ConsumoComercial)) throw new AssertionError("Tipo nao atualizado");
        s.remover(1); igual(1, s.listar().size());
        s.remover(2); igual(0, s.listar().size()); igual(0, s.media());
        // Associacao: a mesma instancia pode estar em dois objetos.
        Unidade pessoa = new Unidade("Compartilhado");
        Consumo a = new ConsumoResidencial(1, "A", pessoa, 0.8, 250);
        Consumo b = new ConsumoComercial(2, "B", pessoa, 0.8, 250);
        if (a.getResponsavel() != b.getResponsavel()) throw new AssertionError("Associacao perdida");
        Calculavel contrato = b; igual(230.0, contrato.calcularTotal());
        System.out.println("OK - Simulador de consumo de energia: calculos, cadastro, alteracao, exclusao e validacoes");
    }
}
