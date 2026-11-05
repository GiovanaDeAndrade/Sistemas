package estudo.t15.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Consumidor {
    private final String nome;
    public Consumidor(String nome) { this.nome = Validacao.texto(nome, "Consumidor"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
