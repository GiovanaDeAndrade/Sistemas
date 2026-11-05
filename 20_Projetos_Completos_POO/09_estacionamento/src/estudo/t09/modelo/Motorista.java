package estudo.t09.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Motorista {
    private final String nome;
    public Motorista(String nome) { this.nome = Validacao.texto(nome, "Motorista"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
