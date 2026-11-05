package estudo.t11.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class MatriculaRegular extends Matricula {
    public MatriculaRegular(int id, String descricao, Aluno responsavel,
                 double mensalidade, int parcelas) {
        super(id, descricao, responsavel, mensalidade, parcelas);
    }
    @Override public String getTipo() { return "Regular"; }
    @Override public double calcularTotal() {
        return getMensalidade() * getParcelas();
    }
}
