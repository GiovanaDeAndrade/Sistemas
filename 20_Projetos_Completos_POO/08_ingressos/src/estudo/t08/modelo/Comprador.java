package estudo.t08.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Comprador {
    private final String nome;
    public Comprador(String nome) { this.nome = Validacao.texto(nome, "Comprador"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
