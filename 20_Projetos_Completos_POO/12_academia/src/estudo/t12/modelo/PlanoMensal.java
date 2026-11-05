package estudo.t12.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class PlanoMensal extends Plano {
    public PlanoMensal(int id, String descricao, Associado responsavel,
                 double mensalidade, int meses) {
        super(id, descricao, responsavel, mensalidade, meses);
    }
    @Override public String getTipo() { return "Mensal"; }
    @Override public double calcularTotal() {
        return getMensalidade() * getMeses();
    }
}
