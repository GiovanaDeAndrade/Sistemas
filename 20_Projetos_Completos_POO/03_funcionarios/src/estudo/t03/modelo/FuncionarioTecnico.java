package estudo.t03.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class FuncionarioTecnico extends Funcionario {
    public FuncionarioTecnico(int id, String descricao, Departamento responsavel,
                 double salarioBase, int horasExtras) {
        super(id, descricao, responsavel, salarioBase, horasExtras);
    }
    @Override public String getTipo() { return "Técnico"; }
    @Override public double calcularTotal() {
        return getSalarioBase() + getHorasExtras() * 30 + 300;
    }
}
