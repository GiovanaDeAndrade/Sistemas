package estudo.t11.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Matricula implements Calculavel {
    private final int id;
    private final String descricao;
    private final Aluno responsavel;
    private final double mensalidade;
    private final int parcelas;

    public Matricula(int id, String descricao, Aluno responsavel,
                    double mensalidade, int parcelas) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Aluno obrigatorio");
        this.responsavel = responsavel;
        this.mensalidade = Validacao.valor(mensalidade, "Mensalidade");
        this.parcelas = Validacao.quantidade(parcelas, 1, "Número de parcelas");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Aluno getResponsavel() { return responsavel; }
    public double getMensalidade() { return mensalidade; }
    public int getParcelas() { return parcelas; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
