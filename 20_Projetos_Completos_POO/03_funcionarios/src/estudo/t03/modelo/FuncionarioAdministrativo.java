package estudo.t03.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class FuncionarioAdministrativo extends Funcionario {
    public FuncionarioAdministrativo(int id, String descricao, Departamento responsavel,
                 double salarioBase, int horasExtras) {
        super(id, descricao, responsavel, salarioBase, horasExtras);
    }
    @Override public String getTipo() { return "Administrativo"; }
    @Override public double calcularTotal() {
        return getSalarioBase() + getHorasExtras() * 20;
    }
}
