package estudo.t01.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ProdutoPromocional extends Produto {
    public ProdutoPromocional(int id, String descricao, Fornecedor responsavel,
                 double precoUnitario, int quantidade) {
        super(id, descricao, responsavel, precoUnitario, quantidade);
    }
    @Override public String getTipo() { return "Promocional"; }
    @Override public double calcularTotal() {
        return getPrecoUnitario() * getQuantidade() * 0.90;
    }
}
