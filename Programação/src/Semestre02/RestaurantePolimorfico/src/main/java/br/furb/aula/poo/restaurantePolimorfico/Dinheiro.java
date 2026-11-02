package br.furb.aula.poo.restaurantePolimorfico;

public class Dinheiro implements MetodoPagamento {
    private double valor;

    public Dinheiro(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0 || !Double.isFinite(valor)) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valor = valor;
    }

    @Override
    public double calcularDesconto(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido invalido");
        }
        return pedido.calcularValorPedido() * 0.10;
    }

    @Override
    public double calcularTroco(double valorPedido) {
        if (valorPedido <= 0 || !Double.isFinite(valorPedido)) {
            throw new IllegalArgumentException("ValorPedido invalido");
        }
        return valor - valorPedido;
    }
}
