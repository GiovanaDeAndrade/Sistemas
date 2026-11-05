package estudo.t01.servico;

import java.util.ArrayList;
import java.util.List;
import estudo.t01.modelo.*;
import estudo.t01.repositorio.Repositorio;
import estudo.t01.excecao.OperacaoInvalidaException;

/** Mesmas regras para console e Swing. Nao importa componentes de interface. */
public class Servico {
    private final Repositorio repositorio;
    public Servico(Repositorio repositorio) {
        if (repositorio == null) throw new IllegalArgumentException("Repositorio obrigatorio");
        this.repositorio = repositorio;
    }
    private Produto criar(int tipo, int id, String descricao, String responsavel,
                          double valor, int quantidade) throws OperacaoInvalidaException {
        try {
            Fornecedor associado = new Fornecedor(responsavel);
            switch (tipo) {
                case 1: return new ProdutoComum(id, descricao, associado, valor, quantidade);
                case 2: return new ProdutoPromocional(id, descricao, associado, valor, quantidade);
                default: throw new OperacaoInvalidaException("Tipo deve ser 1 ou 2");
            }
        } catch (IllegalArgumentException e) {
            throw new OperacaoInvalidaException(e.getMessage());
        }
    }
    public void cadastrar(int tipo, int id, String descricao, String responsavel,
                          double valor, int quantidade) throws OperacaoInvalidaException {
        repositorio.adicionar(criar(tipo, id, descricao, responsavel, valor, quantidade));
    }
    public void atualizar(int tipo, int id, String descricao, String responsavel,
                          double valor, int quantidade) throws OperacaoInvalidaException {
        // Cria e valida antes de substituir: falha nao deixa alteracao pela metade.
        repositorio.substituir(criar(tipo, id, descricao, responsavel, valor, quantidade));
    }
    public Produto buscar(int id) throws OperacaoInvalidaException {
        Produto resultado = repositorio.buscar(id);
        if (resultado == null) throw new OperacaoInvalidaException("ID nao encontrado");
        return resultado;
    }
    public void remover(int id) throws OperacaoInvalidaException { repositorio.remover(id); }
    public List<Produto> listar() { return repositorio.listar(); }
    public double total() {
        double soma = 0;
        for (Produto registro : listar()) soma += registro.calcularTotal();
        return soma; // Chamada polimorfica: cada subtipo calcula de um jeito.
    }
    public double media() { return listar().isEmpty() ? 0 : total() / listar().size(); }
    public Produto maior() {
        Produto maior = null;
        for (Produto r : listar())
            if (maior == null || r.calcularTotal() > maior.calcularTotal()) maior = r;
        return maior;
    }
    public List<Produto> filtrarDestaques() {
        List<Produto> encontrados = new ArrayList<>();
        for (Produto r : listar()) if (r.calcularTotal() >= 250) encontrados.add(r);
        return encontrados;
    }
    public List<Produto> buscarPorResponsavel(String termo) {
        if (termo == null) throw new IllegalArgumentException("Termo obrigatorio");
        List<Produto> encontrados = new ArrayList<>();
        for (Produto r : listar())
            if (r.getResponsavel().getNome().toLowerCase(java.util.Locale.ROOT)
                    .contains(termo.trim().toLowerCase(java.util.Locale.ROOT))) encontrados.add(r);
        return encontrados;
    }
    public String resumo() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "Registros: %d%nTotal: R$ %.2f%nMedia: R$ %.2f%nMaior: %s",
            listar().size(), total(), media(), maior() == null ? "nenhum" : maior().toString());
    }
    public void carregarExemplos() throws OperacaoInvalidaException {
        if (repositorio.buscar(1) != null || repositorio.buscar(2) != null)
            throw new OperacaoInvalidaException("IDs 1 e 2 devem estar livres para os exemplos");
        cadastrar(1, 1, "Exemplo A", "Ana", 100, 3);
        cadastrar(2, 2, "Exemplo B", "Bruno", 100, 3);
    }
}
