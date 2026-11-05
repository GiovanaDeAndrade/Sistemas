package estudo.t17;

import estudo.t17.modelo.*;
import estudo.t17.repositorio.Repositorio;
import estudo.t17.servico.Servico;
import estudo.t17.excecao.OperacaoInvalidaException;

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
        igual(300.0, s.buscar(1).calcularTotal());
        igual(480.0, s.buscar(2).calcularTotal());
        igual(300.0 + 480.0, s.total());
        igual((300.0 + 480.0) / 2, s.media());
        igual(Math.max(300.0, 480.0), s.maior().calcularTotal());
        igual(1, s.buscarPorResponsavel("ANA").size());
        int destaques = 0;
        for (Assinatura r : s.listar()) if (r.getMeses() >= 12) destaques++;
        igual(destaques, s.filtrarDestaques().size());
        s.listar().clear(); igual(2, s.listar().size());
        erroEsperado(() -> s.carregarExemplos()); // Nao duplica nem altera parcialmente.
        igual(2, s.listar().size());
        erroEsperado(() -> s.cadastrar(1, 1, "Duplicado", "Ana", 25, 12));
        erroEsperado(() -> s.cadastrar(1, 3, " ", "Ana", 25, 12));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", " ", 25, 12));
        erroEsperado(() -> s.cadastrar(1, 0, "Teste", "Ana", 25, 12));
        erroEsperado(() -> s.cadastrar(3, 3, "Teste", "Ana", 25, 12));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", -1, 12));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.NaN, 12));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.POSITIVE_INFINITY, 12));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", 25, 1 - 1));
        erroEsperado(() -> s.buscar(999));
        erroEsperado(() -> s.remover(999));
        erroEsperado(() -> s.atualizar(1, 999, "Teste", "Ana", 25, 12));
        erroEsperado(() -> s.atualizar(1, 1, "Teste", "Ana", -1, 12));
        igual(300.0, s.buscar(1).calcularTotal()); // Falha manteve os dados anteriores.
        s.atualizar(2, 1, "Atualizado", "Ana Maria", 25, 12);
        igual(480.0, s.buscar(1).calcularTotal());
        if (!(s.buscar(1) instanceof AssinaturaFamilia)) throw new AssertionError("Tipo nao atualizado");
        s.remover(1); igual(1, s.listar().size());
        s.remover(2); igual(0, s.listar().size()); igual(0, s.media());
        // Associacao: a mesma instancia pode estar em dois objetos.
        Assinante pessoa = new Assinante("Compartilhado");
        Assinatura a = new AssinaturaBasica(1, "A", pessoa, 25, 12);
        Assinatura b = new AssinaturaFamilia(2, "B", pessoa, 25, 12);
        if (a.getResponsavel() != b.getResponsavel()) throw new AssertionError("Associacao perdida");
        Calculavel contrato = b; igual(480.0, contrato.calcularTotal());
        System.out.println("OK - Assinaturas de conteúdo: calculos, cadastro, alteracao, exclusao e validacoes");
    }
}
