package estudo.t11.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Aluno {
    private final String nome;
    public Aluno(String nome) { this.nome = Validacao.texto(nome, "Aluno"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
