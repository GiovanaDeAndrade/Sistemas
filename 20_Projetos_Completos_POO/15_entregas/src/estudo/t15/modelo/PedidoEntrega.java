package estudo.t15.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class PedidoEntrega extends Pedido {
    public PedidoEntrega(int id, String descricao, Consumidor responsavel,
                 double precoItem, int itens) {
        super(id, descricao, responsavel, precoItem, itens);
    }
    @Override public String getTipo() { return "Entrega"; }
    @Override public double calcularTotal() {
        return getPrecoItem() * getItens() + (getPrecoItem() * getItens() >= 100 ? 0 : 12);
    }
}
