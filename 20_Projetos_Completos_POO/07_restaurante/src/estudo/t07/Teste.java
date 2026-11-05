package estudo.t07;

import estudo.t07.modelo.*;
import estudo.t07.repositorio.Repositorio;
import estudo.t07.servico.Servico;
import estudo.t07.excecao.OperacaoInvalidaException;

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
        igual(120.0, s.buscar(1).calcularTotal());
        igual(132.0, s.buscar(2).calcularTotal());
        igual(120.0 + 132.0, s.total());
        igual((120.0 + 132.0) / 2, s.media());
        igual(Math.max(120.0, 132.0), s.maior().calcularTotal());
        igual(1, s.buscarPorResponsavel("ANA").size());
        int destaques = 0;
        for (Comanda r : s.listar()) if (r.getRefeicoes() >= 3) destaques++;
        igual(destaques, s.filtrarDestaques().size());
        s.listar().clear(); igual(2, s.listar().size());
        erroEsperado(() -> s.carregarExemplos()); // Nao duplica nem altera parcialmente.
        igual(2, s.listar().size());
        erroEsperado(() -> s.cadastrar(1, 1, "Duplicado", "Ana", 40, 3));
        erroEsperado(() -> s.cadastrar(1, 3, " ", "Ana", 40, 3));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", " ", 40, 3));
        erroEsperado(() -> s.cadastrar(1, 0, "Teste", "Ana", 40, 3));
        erroEsperado(() -> s.cadastrar(3, 3, "Teste", "Ana", 40, 3));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", -1, 3));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.NaN, 3));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.POSITIVE_INFINITY, 3));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", 40, 1 - 1));
        erroEsperado(() -> s.buscar(999));
        erroEsperado(() -> s.remover(999));
        erroEsperado(() -> s.atualizar(1, 999, "Teste", "Ana", 40, 3));
        erroEsperado(() -> s.atualizar(1, 1, "Teste", "Ana", -1, 3));
        igual(120.0, s.buscar(1).calcularTotal()); // Falha manteve os dados anteriores.
        s.atualizar(2, 1, "Atualizado", "Ana Maria", 40, 3);
        igual(132.0, s.buscar(1).calcularTotal());
        if (!(s.buscar(1) instanceof ComandaMesa)) throw new AssertionError("Tipo nao atualizado");
        s.remover(1); igual(1, s.listar().size());
        s.remover(2); igual(0, s.listar().size()); igual(0, s.media());
        // Associacao: a mesma instancia pode estar em dois objetos.
        Mesa pessoa = new Mesa("Compartilhado");
        Comanda a = new ComandaBalcao(1, "A", pessoa, 40, 3);
        Comanda b = new ComandaMesa(2, "B", pessoa, 40, 3);
        if (a.getResponsavel() != b.getResponsavel()) throw new AssertionError("Associacao perdida");
        Calculavel contrato = b; igual(132.0, contrato.calcularTotal());
        System.out.println("OK - Restaurante e comandas: calculos, cadastro, alteracao, exclusao e validacoes");
    }
}
