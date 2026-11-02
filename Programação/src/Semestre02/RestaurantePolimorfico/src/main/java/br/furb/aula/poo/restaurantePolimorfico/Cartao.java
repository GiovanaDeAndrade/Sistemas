package br.furb.aula.poo.restaurantePolimorfico;

public class Cartao implements MetodoPagamento {
    private double saldo;

    public Cartao(double saldo) {
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo <= 0 || !Double.isFinite(saldo)) {
            throw new IllegalArgumentException("Saldo invalido");
        }
        this.saldo = saldo;
    }

    @Override
    public double calcularDesconto(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido invalido");
        }
        return pedido.calcularValorPedido() * 0.05;
    }

    @Override
    public double calcularTroco(double valorPedido) {
        if (valorPedido <= 0 || !Double.isFinite(valorPedido)) {
            throw new IllegalArgumentException("ValorPedido invalido");
        }
        return 0;
    }
}
