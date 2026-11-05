package estudo.t13.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Atendimento implements Calculavel {
    private final int id;
    private final String descricao;
    private final Tutor responsavel;
    private final double precoSessao;
    private final int sessoes;

    public Atendimento(int id, String descricao, Tutor responsavel,
                    double precoSessao, int sessoes) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Tutor obrigatorio");
        this.responsavel = responsavel;
        this.precoSessao = Validacao.valor(precoSessao, "Preço por sessão");
        this.sessoes = Validacao.quantidade(sessoes, 1, "Sessões");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Tutor getResponsavel() { return responsavel; }
    public double getPrecoSessao() { return precoSessao; }
    public int getSessoes() { return sessoes; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
