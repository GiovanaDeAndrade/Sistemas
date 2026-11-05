package estudo.t10.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Destinatario {
    private final String nome;
    public Destinatario(String nome) { this.nome = Validacao.texto(nome, "Destinatario"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
