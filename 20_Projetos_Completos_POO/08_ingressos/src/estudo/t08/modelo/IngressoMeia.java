package estudo.t08.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class IngressoMeia extends VendaIngresso {
    public IngressoMeia(int id, String descricao, Comprador responsavel,
                 double precoInteira, int ingressos) {
        super(id, descricao, responsavel, precoInteira, ingressos);
    }
    @Override public String getTipo() { return "Meia"; }
    @Override public double calcularTotal() {
        return getPrecoInteira() * getIngressos() * 0.5;
    }
}
