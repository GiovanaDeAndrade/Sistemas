package estudo.t08.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class IngressoInteiro extends VendaIngresso {
    public IngressoInteiro(int id, String descricao, Comprador responsavel,
                 double precoInteira, int ingressos) {
        super(id, descricao, responsavel, precoInteira, ingressos);
    }
    @Override public String getTipo() { return "Inteira"; }
    @Override public double calcularTotal() {
        return getPrecoInteira() * getIngressos();
    }
}
