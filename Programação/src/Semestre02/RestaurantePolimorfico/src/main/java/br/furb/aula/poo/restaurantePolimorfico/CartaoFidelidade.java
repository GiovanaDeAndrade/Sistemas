package br.furb.aula.poo.restaurantePolimorfico;

public class CartaoFidelidade extends Cartao {
    public CartaoFidelidade(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularDesconto(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido invalido");
        }
        double sobremesas = 0;
        for (Prato prato : pedido.getPratos()) {
            if (prato.getCategoria() == Categoria.SOBREMESA) {
                sobremesas += prato.getValor();
            }
        }
        if (sobremesas > 0) {
            return sobremesas;
        }
        return pedido.calcularValorPedido() * 0.30;
    }
}
