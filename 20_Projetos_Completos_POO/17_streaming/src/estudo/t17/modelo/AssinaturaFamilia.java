package estudo.t17.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class AssinaturaFamilia extends Assinatura {
    public AssinaturaFamilia(int id, String descricao, Assinante responsavel,
                 double precoMensal, int meses) {
        super(id, descricao, responsavel, precoMensal, meses);
    }
    @Override public String getTipo() { return "Família"; }
    @Override public double calcularTotal() {
        return (getPrecoMensal() + 15) * getMeses();
    }
}
