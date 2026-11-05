package estudo.t06.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Reserva implements Calculavel {
    private final int id;
    private final String descricao;
    private final Hospede responsavel;
    private final double diaria;
    private final int noites;

    public Reserva(int id, String descricao, Hospede responsavel,
                    double diaria, int noites) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Hospede obrigatorio");
        this.responsavel = responsavel;
        this.diaria = Validacao.valor(diaria, "Diária");
        this.noites = Validacao.quantidade(noites, 1, "Número de noites");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Hospede getResponsavel() { return responsavel; }
    public double getDiaria() { return diaria; }
    public int getNoites() { return noites; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
