package estudo.t12.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Plano implements Calculavel {
    private final int id;
    private final String descricao;
    private final Associado responsavel;
    private final double mensalidade;
    private final int meses;

    public Plano(int id, String descricao, Associado responsavel,
                    double mensalidade, int meses) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Associado obrigatorio");
        this.responsavel = responsavel;
        this.mensalidade = Validacao.valor(mensalidade, "Mensalidade");
        this.meses = Validacao.quantidade(meses, 1, "Meses contratados");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Associado getResponsavel() { return responsavel; }
    public double getMensalidade() { return mensalidade; }
    public int getMeses() { return meses; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
