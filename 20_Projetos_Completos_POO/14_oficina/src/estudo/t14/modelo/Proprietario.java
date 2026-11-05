package estudo.t14.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Proprietario {
    private final String nome;
    public Proprietario(String nome) { this.nome = Validacao.texto(nome, "Proprietario"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
