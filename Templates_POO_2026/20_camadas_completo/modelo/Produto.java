package template20.modelo;

public class Produto {
    private final String nome;
    private final double preco;
    public Produto(String nome, double preco) {
        if (nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome obrigatorio");
        if (!Double.isFinite(preco) || preco < 0)
            throw new IllegalArgumentException("Preco invalido");
        this.nome = nome.trim();
        this.preco = preco;
    }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    @Override public String toString() { return nome + " - " + preco; }
}
