package estudo.t05.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Cliente {
    private final String nome;
    public Cliente(String nome) { this.nome = Validacao.texto(nome, "Cliente"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
