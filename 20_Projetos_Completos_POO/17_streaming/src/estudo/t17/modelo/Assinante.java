package estudo.t17.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Assinante {
    private final String nome;
    public Assinante(String nome) { this.nome = Validacao.texto(nome, "Assinante"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
