package estudo.t04.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class EmprestimoComum extends Emprestimo {
    public EmprestimoComum(int id, String descricao, Leitor responsavel,
                 double multaDiaria, int diasAtraso) {
        super(id, descricao, responsavel, multaDiaria, diasAtraso);
    }
    @Override public String getTipo() { return "Comum"; }
    @Override public double calcularTotal() {
        return getMultaDiaria() * getDiasAtraso();
    }
}
