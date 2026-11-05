package estudo.t14;

import estudo.t14.modelo.*;
import estudo.t14.repositorio.Repositorio;
import estudo.t14.servico.Servico;
import estudo.t14.excecao.OperacaoInvalidaException;

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
        igual(320.0, s.buscar(1).calcularTotal());
        igual(580.0, s.buscar(2).calcularTotal());
        igual(320.0 + 580.0, s.total());
        igual((320.0 + 580.0) / 2, s.media());
        igual(Math.max(320.0, 580.0), s.maior().calcularTotal());
        igual(1, s.buscarPorResponsavel("ANA").size());
        int destaques = 0;
        for (OrdemServico r : s.listar()) if (r.calcularTotal() >= 500) destaques++;
        igual(destaques, s.filtrarDestaques().size());
        s.listar().clear(); igual(2, s.listar().size());
        erroEsperado(() -> s.carregarExemplos()); // Nao duplica nem altera parcialmente.
        igual(2, s.listar().size());
        erroEsperado(() -> s.cadastrar(1, 1, "Duplicado", "Ana", 80, 4));
        erroEsperado(() -> s.cadastrar(1, 3, " ", "Ana", 80, 4));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", " ", 80, 4));
        erroEsperado(() -> s.cadastrar(1, 0, "Teste", "Ana", 80, 4));
        erroEsperado(() -> s.cadastrar(3, 3, "Teste", "Ana", 80, 4));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", -1, 4));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.NaN, 4));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", Double.POSITIVE_INFINITY, 4));
        erroEsperado(() -> s.cadastrar(1, 3, "Teste", "Ana", 80, 1 - 1));
        erroEsperado(() -> s.buscar(999));
        erroEsperado(() -> s.remover(999));
        erroEsperado(() -> s.atualizar(1, 999, "Teste", "Ana", 80, 4));
        erroEsperado(() -> s.atualizar(1, 1, "Teste", "Ana", -1, 4));
        igual(320.0, s.buscar(1).calcularTotal()); // Falha manteve os dados anteriores.
        s.atualizar(2, 1, "Atualizado", "Ana Maria", 80, 4);
        igual(580.0, s.buscar(1).calcularTotal());
        if (!(s.buscar(1) instanceof ServicoEmergencial)) throw new AssertionError("Tipo nao atualizado");
        s.remover(1); igual(1, s.listar().size());
        s.remover(2); igual(0, s.listar().size()); igual(0, s.media());
        // Associacao: a mesma instancia pode estar em dois objetos.
        Proprietario pessoa = new Proprietario("Compartilhado");
        OrdemServico a = new ServicoPreventivo(1, "A", pessoa, 80, 4);
        OrdemServico b = new ServicoEmergencial(2, "B", pessoa, 80, 4);
        if (a.getResponsavel() != b.getResponsavel()) throw new AssertionError("Associacao perdida");
        Calculavel contrato = b; igual(580.0, contrato.calcularTotal());
        System.out.println("OK - Oficina e ordens de serviço: calculos, cadastro, alteracao, exclusao e validacoes");
    }
}
