package estudo.t03.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Funcionario implements Calculavel {
    private final int id;
    private final String descricao;
    private final Departamento responsavel;
    private final double salarioBase;
    private final int horasExtras;

    public Funcionario(int id, String descricao, Departamento responsavel,
                    double salarioBase, int horasExtras) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Departamento obrigatorio");
        this.responsavel = responsavel;
        this.salarioBase = Validacao.valor(salarioBase, "Salário base mensal");
        this.horasExtras = Validacao.quantidade(horasExtras, 0, "Horas extras");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Departamento getResponsavel() { return responsavel; }
    public double getSalarioBase() { return salarioBase; }
    public int getHorasExtras() { return horasExtras; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
