package estudo.t02.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class VendedorExterno extends Vendedor {
    public VendedorExterno(int id, String descricao, Loja responsavel,
                 double vendas, int meses) {
        super(id, descricao, responsavel, vendas, meses);
    }
    @Override public String getTipo() { return "Externo"; }
    @Override public double calcularTotal() {
        return getVendas() * 0.08 + getMeses() * 100;
    }
}
