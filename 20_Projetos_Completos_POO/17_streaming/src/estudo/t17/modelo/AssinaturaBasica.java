package estudo.t17.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class AssinaturaBasica extends Assinatura {
    public AssinaturaBasica(int id, String descricao, Assinante responsavel,
                 double precoMensal, int meses) {
        super(id, descricao, responsavel, precoMensal, meses);
    }
    @Override public String getTipo() { return "Básica"; }
    @Override public double calcularTotal() {
        return getPrecoMensal() * getMeses();
    }
}
