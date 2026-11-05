package estudo.t06.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Hospede {
    private final String nome;
    public Hospede(String nome) { this.nome = Validacao.texto(nome, "Hospede"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
