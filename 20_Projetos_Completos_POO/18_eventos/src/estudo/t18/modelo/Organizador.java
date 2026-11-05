package estudo.t18.modelo;

/** Objeto associado. Pode ser compartilhado por varios registros. */
public class Organizador {
    private final String nome;
    public Organizador(String nome) { this.nome = Validacao.texto(nome, "Organizador"); }
    public String getNome() { return nome; }
    @Override public String toString() { return nome; }
}
