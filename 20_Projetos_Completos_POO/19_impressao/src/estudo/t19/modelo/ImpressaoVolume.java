package estudo.t19.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ImpressaoVolume extends Trabalho {
    public ImpressaoVolume(int id, String descricao, Solicitante responsavel,
                 double precoPagina, int paginas) {
        super(id, descricao, responsavel, precoPagina, paginas);
    }
    @Override public String getTipo() { return "Volume"; }
    @Override public double calcularTotal() {
        return getPrecoPagina() * getPaginas() * (getPaginas() >= 100 ? 0.80 : 1);
    }
}
