package estudo.t20.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Viajante {
    private final String nome;
    public Viajante(String nome) { this.nome = Validacao.texto(nome, "Viajante"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
