package estudo.t02.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Loja {
    private final String nome;
    public Loja(String nome) { this.nome = Validacao.texto(nome, "Loja"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
