package estudo.t16.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Unidade {
    private final String nome;
    public Unidade(String nome) { this.nome = Validacao.texto(nome, "Unidade"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
