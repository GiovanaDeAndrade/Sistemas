package estudo.t04.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Leitor {
    private final String nome;
    public Leitor(String nome) { this.nome = Validacao.texto(nome, "Leitor"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
