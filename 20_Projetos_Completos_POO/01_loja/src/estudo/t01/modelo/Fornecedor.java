package estudo.t01.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Fornecedor {
    private final String nome;
    public Fornecedor(String nome) { this.nome = Validacao.texto(nome, "Fornecedor"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
