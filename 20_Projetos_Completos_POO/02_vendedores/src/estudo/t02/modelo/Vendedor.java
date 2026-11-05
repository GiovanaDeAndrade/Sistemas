package estudo.t02.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Vendedor implements Calculavel {
    private final int id;
    private final String descricao;
    private final Loja responsavel;
    private final double vendas;
    private final int meses;

    public Vendedor(int id, String descricao, Loja responsavel,
                    double vendas, int meses) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Loja obrigatorio");
        this.responsavel = responsavel;
        this.vendas = Validacao.valor(vendas, "Total vendido");
        this.meses = Validacao.quantidade(meses, 1, "Meses no período");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Loja getResponsavel() { return responsavel; }
    public double getVendas() { return vendas; }
    public int getMeses() { return meses; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
