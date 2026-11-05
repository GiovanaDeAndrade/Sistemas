package estudo.t20.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Pacote implements Calculavel {
    private final int id;
    private final String descricao;
    private final Viajante responsavel;
    private final double precoDia;
    private final int dias;

    public Pacote(int id, String descricao, Viajante responsavel,
                    double precoDia, int dias) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Viajante obrigatorio");
        this.responsavel = responsavel;
        this.precoDia = Validacao.valor(precoDia, "Preço por dia");
        this.dias = Validacao.quantidade(dias, 1, "Dias de viagem");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Viajante getResponsavel() { return responsavel; }
    public double getPrecoDia() { return precoDia; }
    public int getDias() { return dias; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
