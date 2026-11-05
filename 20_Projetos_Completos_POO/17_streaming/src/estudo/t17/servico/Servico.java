package estudo.t17.servico;

import java.util.ArrayList;
import java.util.List;
import estudo.t17.modelo.*;
import estudo.t17.repositorio.Repositorio;
import estudo.t17.excecao.OperacaoInvalidaException;

/** Mesmas regras para console e Swing. Nao importa componentes de interface. */
public class Servico {
    private final Repositorio repositorio;
    public Servico(Repositorio repositorio) {
        if (repositorio == null) throw new IllegalArgumentException("Repositorio obrigatorio");
        this.repositorio = repositorio;
    }
    private Assinatura criar(int tipo, int id, String descricao, String responsavel,
                          double valor, int quantidade) throws OperacaoInvalidaException {
        try {
            Assinante associado = new Assinante(responsavel);
            switch (tipo) {
                case 1: return new AssinaturaBasica(id, descricao, associado, valor, quantidade);
                case 2: return new AssinaturaFamilia(id, descricao, associado, valor, quantidade);
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
    public Assinatura buscar(int id) throws OperacaoInvalidaException {
        Assinatura resultado = repositorio.buscar(id);
        if (resultado == null) throw new OperacaoInvalidaException("ID nao encontrado");
        return resultado;
    }
    public void remover(int id) throws OperacaoInvalidaException { repositorio.remover(id); }
    public List<Assinatura> listar() { return repositorio.listar(); }
    public double total() {
        double soma = 0;
        for (Assinatura registro : listar()) soma += registro.calcularTotal();
        return soma; // Chamada polimorfica: cada subtipo calcula de um jeito.
    }
    public double media() { return listar().isEmpty() ? 0 : total() / listar().size(); }
    public Assinatura maior() {
        Assinatura maior = null;
        for (Assinatura r : listar())
            if (maior == null || r.calcularTotal() > maior.calcularTotal()) maior = r;
        return maior;
    }
    public List<Assinatura> filtrarDestaques() {
        List<Assinatura> encontrados = new ArrayList<>();
        for (Assinatura r : listar()) if (r.getMeses() >= 12) encontrados.add(r);
        return encontrados;
    }
    public List<Assinatura> buscarPorResponsavel(String termo) {
        if (termo == null) throw new IllegalArgumentException("Termo obrigatorio");
        List<Assinatura> encontrados = new ArrayList<>();
        for (Assinatura r : listar())
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
        cadastrar(1, 1, "Exemplo A", "Ana", 25, 12);
        cadastrar(2, 2, "Exemplo B", "Bruno", 25, 12);
    }
}
