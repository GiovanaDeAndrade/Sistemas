package estudo.t02.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class VendedorInterno extends Vendedor {
    public VendedorInterno(int id, String descricao, Loja responsavel,
                 double vendas, int meses) {
        super(id, descricao, responsavel, vendas, meses);
    }
    @Override public String getTipo() { return "Interno"; }
    @Override public double calcularTotal() {
        return getVendas() * 0.05;
    }
}
