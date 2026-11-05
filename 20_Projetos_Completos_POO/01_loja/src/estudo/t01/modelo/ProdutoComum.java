package estudo.t01.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ProdutoComum extends Produto {
    public ProdutoComum(int id, String descricao, Fornecedor responsavel,
                 double precoUnitario, int quantidade) {
        super(id, descricao, responsavel, precoUnitario, quantidade);
    }
    @Override public String getTipo() { return "Comum"; }
    @Override public double calcularTotal() {
        return getPrecoUnitario() * getQuantidade();
    }
}
