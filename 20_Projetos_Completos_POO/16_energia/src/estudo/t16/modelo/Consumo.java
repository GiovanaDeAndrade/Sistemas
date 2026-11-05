package estudo.t16.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Consumo implements Calculavel {
    private final int id;
    private final String descricao;
    private final Unidade responsavel;
    private final double tarifa;
    private final int kwh;

    public Consumo(int id, String descricao, Unidade responsavel,
                    double tarifa, int kwh) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Unidade obrigatorio");
        this.responsavel = responsavel;
        this.tarifa = Validacao.valor(tarifa, "Tarifa por kWh");
        this.kwh = Validacao.quantidade(kwh, 0, "Consumo inteiro em kWh");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Unidade getResponsavel() { return responsavel; }
    public double getTarifa() { return tarifa; }
    public int getKwh() { return kwh; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
