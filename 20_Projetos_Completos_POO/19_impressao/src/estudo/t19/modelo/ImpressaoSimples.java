package estudo.t19.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ImpressaoSimples extends Trabalho {
    public ImpressaoSimples(int id, String descricao, Solicitante responsavel,
                 double precoPagina, int paginas) {
        super(id, descricao, responsavel, precoPagina, paginas);
    }
    @Override public String getTipo() { return "Simples"; }
    @Override public double calcularTotal() {
        return getPrecoPagina() * getPaginas();
    }
}
