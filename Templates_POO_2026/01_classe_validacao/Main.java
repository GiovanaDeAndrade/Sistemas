package template01;


// Classe, construtor, getters e setters
// ADAPTE: Produto, nome, preco e regras dos setters.
class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double preco) {
        setNome(nome); // Construtor reutiliza as mesmas validacoes.
        setPreco(preco);
    }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome obrigatorio");
        this.nome = nome.trim();
    }
    public void setPreco(double preco) {
        if (!Double.isFinite(preco) || preco < 0)
            throw new IllegalArgumentException("Preco invalido");
        this.preco = preco;
    }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    @Override public String toString() { return nome + ": " + preco; }
}

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Caderno", 20);
        p.setPreco(25);
        System.out.println(p);
        try { p.setPreco(-1); }
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
