package estudo.t19.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Solicitante {
    private final String nome;
    public Solicitante(String nome) { this.nome = Validacao.texto(nome, "Solicitante"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
