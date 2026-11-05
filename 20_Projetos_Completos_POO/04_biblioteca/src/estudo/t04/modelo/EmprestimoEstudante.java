package estudo.t04.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class EmprestimoEstudante extends Emprestimo {
    public EmprestimoEstudante(int id, String descricao, Leitor responsavel,
                 double multaDiaria, int diasAtraso) {
        super(id, descricao, responsavel, multaDiaria, diasAtraso);
    }
    @Override public String getTipo() { return "Estudante"; }
    @Override public double calcularTotal() {
        return getMultaDiaria() * Math.max(0, getDiasAtraso() - 2);
    }
}
