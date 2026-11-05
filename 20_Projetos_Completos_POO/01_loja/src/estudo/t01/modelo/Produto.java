package estudo.t01.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Produto implements Calculavel {
    private final int id;
    private final String descricao;
    private final Fornecedor responsavel;
    private final double precoUnitario;
    private final int quantidade;

    public Produto(int id, String descricao, Fornecedor responsavel,
                    double precoUnitario, int quantidade) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Fornecedor obrigatorio");
        this.responsavel = responsavel;
        this.precoUnitario = Validacao.valor(precoUnitario, "Preço unitário");
        this.quantidade = Validacao.quantidade(quantidade, 1, "Quantidade");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Fornecedor getResponsavel() { return responsavel; }
    public double getPrecoUnitario() { return precoUnitario; }
    public int getQuantidade() { return quantidade; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
