package estudo.t03.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Departamento {
    private final String nome;
    public Departamento(String nome) { this.nome = Validacao.texto(nome, "Departamento"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
