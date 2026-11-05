package estudo.t10.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Frete implements Calculavel {
    private final int id;
    private final String descricao;
    private final Destinatario responsavel;
    private final double precoQuilo;
    private final int quilos;

    public Frete(int id, String descricao, Destinatario responsavel,
                    double precoQuilo, int quilos) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Destinatario obrigatorio");
        this.responsavel = responsavel;
        this.precoQuilo = Validacao.valor(precoQuilo, "Preço por quilo");
        this.quilos = Validacao.quantidade(quilos, 1, "Peso inteiro em quilos");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Destinatario getResponsavel() { return responsavel; }
    public double getPrecoQuilo() { return precoQuilo; }
    public int getQuilos() { return quilos; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
