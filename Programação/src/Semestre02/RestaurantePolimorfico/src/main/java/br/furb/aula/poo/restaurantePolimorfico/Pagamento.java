package br.furb.aula.poo.restaurantePolimorfico;

public class Pagamento {
    private Pedido pedido;
    private MetodoPagamento metodo;

    public Pagamento(Pedido pedido, MetodoPagamento metodo) {
        setPedido(pedido);
        setMetodo(metodo);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido invalido");
        }
        this.pedido = pedido;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPagamento metodo) {
        if (metodo == null) {
            throw new IllegalArgumentException("Metodo invalido");
        }
        this.metodo = metodo;
    }

    public double calcularTotalPagar() {
        return pedido.calcularValorPedido() - metodo.calcularDesconto(pedido);
    }
}
