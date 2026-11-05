package estudo.t18.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Evento implements Calculavel {
    private final int id;
    private final String descricao;
    private final Organizador responsavel;
    private final double precoPessoa;
    private final int participantes;

    public Evento(int id, String descricao, Organizador responsavel,
                    double precoPessoa, int participantes) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Organizador obrigatorio");
        this.responsavel = responsavel;
        this.precoPessoa = Validacao.valor(precoPessoa, "Preço por participante");
        this.participantes = Validacao.quantidade(participantes, 1, "Participantes");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Organizador getResponsavel() { return responsavel; }
    public double getPrecoPessoa() { return precoPessoa; }
    public int getParticipantes() { return participantes; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
