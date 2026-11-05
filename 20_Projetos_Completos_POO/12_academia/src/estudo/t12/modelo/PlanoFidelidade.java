package estudo.t12.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class PlanoFidelidade extends Plano {
    public PlanoFidelidade(int id, String descricao, Associado responsavel,
                 double mensalidade, int meses) {
        super(id, descricao, responsavel, mensalidade, meses);
    }
    @Override public String getTipo() { return "Fidelidade"; }
    @Override public double calcularTotal() {
        return getMensalidade() * getMeses() * 0.85;
    }
}
