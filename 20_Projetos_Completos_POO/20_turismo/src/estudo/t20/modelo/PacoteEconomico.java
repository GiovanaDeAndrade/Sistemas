package estudo.t20.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class PacoteEconomico extends Pacote {
    public PacoteEconomico(int id, String descricao, Viajante responsavel,
                 double precoDia, int dias) {
        super(id, descricao, responsavel, precoDia, dias);
    }
    @Override public String getTipo() { return "Econômico"; }
    @Override public double calcularTotal() {
        return getPrecoDia() * getDias();
    }
}
