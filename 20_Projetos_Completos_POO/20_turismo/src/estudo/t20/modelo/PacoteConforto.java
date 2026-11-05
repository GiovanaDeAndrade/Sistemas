package estudo.t20.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class PacoteConforto extends Pacote {
    public PacoteConforto(int id, String descricao, Viajante responsavel,
                 double precoDia, int dias) {
        super(id, descricao, responsavel, precoDia, dias);
    }
    @Override public String getTipo() { return "Conforto"; }
    @Override public double calcularTotal() {
        return getPrecoDia() * getDias() + 75 * getDias() + 200;
    }
}
