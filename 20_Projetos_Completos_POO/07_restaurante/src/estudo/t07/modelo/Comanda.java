package estudo.t07.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Comanda implements Calculavel {
    private final int id;
    private final String descricao;
    private final Mesa responsavel;
    private final double precoRefeicao;
    private final int refeicoes;

    public Comanda(int id, String descricao, Mesa responsavel,
                    double precoRefeicao, int refeicoes) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Mesa obrigatorio");
        this.responsavel = responsavel;
        this.precoRefeicao = Validacao.valor(precoRefeicao, "Preço por refeição");
        this.refeicoes = Validacao.quantidade(refeicoes, 1, "Quantidade de refeições");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Mesa getResponsavel() { return responsavel; }
    public double getPrecoRefeicao() { return precoRefeicao; }
    public int getRefeicoes() { return refeicoes; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
