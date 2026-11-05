package estudo.t13.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Tutor {
    private final String nome;
    public Tutor(String nome) { this.nome = Validacao.texto(nome, "Tutor"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
