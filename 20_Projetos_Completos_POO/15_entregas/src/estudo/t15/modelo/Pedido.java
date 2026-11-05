package estudo.t15.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Pedido implements Calculavel {
    private final int id;
    private final String descricao;
    private final Consumidor responsavel;
    private final double precoItem;
    private final int itens;

    public Pedido(int id, String descricao, Consumidor responsavel,
                    double precoItem, int itens) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Consumidor obrigatorio");
        this.responsavel = responsavel;
        this.precoItem = Validacao.valor(precoItem, "Preço do item");
        this.itens = Validacao.quantidade(itens, 1, "Unidades do mesmo item");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Consumidor getResponsavel() { return responsavel; }
    public double getPrecoItem() { return precoItem; }
    public int getItens() { return itens; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
