package estudo.t17.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Assinatura implements Calculavel {
    private final int id;
    private final String descricao;
    private final Assinante responsavel;
    private final double precoMensal;
    private final int meses;

    public Assinatura(int id, String descricao, Assinante responsavel,
                    double precoMensal, int meses) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Assinante obrigatorio");
        this.responsavel = responsavel;
        this.precoMensal = Validacao.valor(precoMensal, "Preço mensal");
        this.meses = Validacao.quantidade(meses, 1, "Meses de assinatura");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Assinante getResponsavel() { return responsavel; }
    public double getPrecoMensal() { return precoMensal; }
    public int getMeses() { return meses; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
