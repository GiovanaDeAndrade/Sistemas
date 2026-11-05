package estudo.t08.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class VendaIngresso implements Calculavel {
    private final int id;
    private final String descricao;
    private final Comprador responsavel;
    private final double precoInteira;
    private final int ingressos;

    public VendaIngresso(int id, String descricao, Comprador responsavel,
                    double precoInteira, int ingressos) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Comprador obrigatorio");
        this.responsavel = responsavel;
        this.precoInteira = Validacao.valor(precoInteira, "Preço da inteira");
        this.ingressos = Validacao.quantidade(ingressos, 1, "Número de ingressos");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Comprador getResponsavel() { return responsavel; }
    public double getPrecoInteira() { return precoInteira; }
    public int getIngressos() { return ingressos; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
