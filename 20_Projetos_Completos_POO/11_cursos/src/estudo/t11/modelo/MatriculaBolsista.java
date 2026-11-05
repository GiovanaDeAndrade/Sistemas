package estudo.t11.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class MatriculaBolsista extends Matricula {
    public MatriculaBolsista(int id, String descricao, Aluno responsavel,
                 double mensalidade, int parcelas) {
        super(id, descricao, responsavel, mensalidade, parcelas);
    }
    @Override public String getTipo() { return "Bolsista"; }
    @Override public double calcularTotal() {
        return getMensalidade() * getParcelas() * 0.70;
    }
}
