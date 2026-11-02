package br.furb.aula.poo.restaurantePolimorfico;

public interface MetodoPagamento {
    double calcularDesconto(Pedido pedido);
    double calcularTroco(double valorPedido);
}
