package estudo.t04.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Emprestimo implements Calculavel {
    private final int id;
    private final String descricao;
    private final Leitor responsavel;
    private final double multaDiaria;
    private final int diasAtraso;

    public Emprestimo(int id, String descricao, Leitor responsavel,
                    double multaDiaria, int diasAtraso) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Leitor obrigatorio");
        this.responsavel = responsavel;
        this.multaDiaria = Validacao.valor(multaDiaria, "Multa por dia");
        this.diasAtraso = Validacao.quantidade(diasAtraso, 0, "Dias de atraso");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Leitor getResponsavel() { return responsavel; }
    public double getMultaDiaria() { return multaDiaria; }
    public int getDiasAtraso() { return diasAtraso; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
