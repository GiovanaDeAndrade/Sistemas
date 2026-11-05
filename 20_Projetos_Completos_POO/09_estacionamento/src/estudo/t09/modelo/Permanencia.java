package estudo.t09.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Permanencia implements Calculavel {
    private final int id;
    private final String descricao;
    private final Motorista responsavel;
    private final double valorHora;
    private final int horas;

    public Permanencia(int id, String descricao, Motorista responsavel,
                    double valorHora, int horas) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Motorista obrigatorio");
        this.responsavel = responsavel;
        this.valorHora = Validacao.valor(valorHora, "Valor por hora");
        this.horas = Validacao.quantidade(horas, 1, "Horas inteiras");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Motorista getResponsavel() { return responsavel; }
    public double getValorHora() { return valorHora; }
    public int getHoras() { return horas; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
