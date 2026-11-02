package br.furb.aula.poo.restaurantePolimorfico;

public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.incluirPrato(new Prato(50, "Lasanha", Categoria.PRINCIPAL));
        pedido.incluirPrato(new Prato(10, "Pudim", Categoria.SOBREMESA));

        Dinheiro dinheiro = new Dinheiro(100);
        Pagamento pagamento = new Pagamento(pedido, dinheiro);
        System.out.println("Valor do pedido: R$ " + pedido.calcularValorPedido());
        System.out.println("Total em dinheiro: R$ " + pagamento.calcularTotalPagar());
        System.out.println("Troco: R$ " + dinheiro.calcularTroco(pagamento.calcularTotalPagar()));

        pagamento.setMetodo(new Cartao(100));
        System.out.println("Total no cartao: R$ " + pagamento.calcularTotalPagar());

        pagamento.setMetodo(new CartaoFidelidade(100));
        System.out.println("Total no cartao fidelidade: R$ " + pagamento.calcularTotalPagar());
    }
}
