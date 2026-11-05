package estudo.t12.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Associado {
    private final String nome;
    public Associado(String nome) { this.nome = Validacao.texto(nome, "Associado"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
