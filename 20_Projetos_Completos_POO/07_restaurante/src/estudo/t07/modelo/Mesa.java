package estudo.t07.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Mesa {
    private final String nome;
    public Mesa(String nome) { this.nome = Validacao.texto(nome, "Mesa"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
