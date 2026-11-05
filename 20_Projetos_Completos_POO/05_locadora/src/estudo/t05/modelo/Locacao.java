package estudo.t05.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Locacao implements Calculavel {
    private final int id;
    private final String descricao;
    private final Cliente responsavel;
    private final double diaria;
    private final int dias;

    public Locacao(int id, String descricao, Cliente responsavel,
                    double diaria, int dias) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Cliente obrigatorio");
        this.responsavel = responsavel;
        this.diaria = Validacao.valor(diaria, "Diária");
        this.dias = Validacao.quantidade(dias, 1, "Dias de locação");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Cliente getResponsavel() { return responsavel; }
    public double getDiaria() { return diaria; }
    public int getDias() { return dias; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
