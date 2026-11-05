package estudo.t19.modelo;

/** Estado comum. A classe abstrata impede instanciar um registro sem categoria. */
public abstract class Trabalho implements Calculavel {
    private final int id;
    private final String descricao;
    private final Solicitante responsavel;
    private final double precoPagina;
    private final int paginas;

    public Trabalho(int id, String descricao, Solicitante responsavel,
                    double precoPagina, int paginas) {
        this.id = Validacao.positivo(id, "ID");
        this.descricao = Validacao.texto(descricao, "Descricao");
        if (responsavel == null) throw new IllegalArgumentException("Solicitante obrigatorio");
        this.responsavel = responsavel;
        this.precoPagina = Validacao.valor(precoPagina, "Preço por página");
        this.paginas = Validacao.quantidade(paginas, 1, "Páginas");
    }
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public Solicitante getResponsavel() { return responsavel; }
    public double getPrecoPagina() { return precoPagina; }
    public int getPaginas() { return paginas; }
    public abstract String getTipo();
    @Override public abstract double calcularTotal();
    @Override public String toString() {
        return String.format(java.util.Locale.forLanguageTag("pt-BR"),
            "#%d | %s | %s | %s | Resultado: R$ %.2f",
            id, descricao, getTipo(), responsavel.getNome(), calcularTotal());
    }
}
