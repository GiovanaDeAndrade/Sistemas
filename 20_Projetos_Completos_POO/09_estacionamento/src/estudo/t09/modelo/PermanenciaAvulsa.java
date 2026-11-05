package estudo.t09.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class PermanenciaAvulsa extends Permanencia {
    public PermanenciaAvulsa(int id, String descricao, Motorista responsavel,
                 double valorHora, int horas) {
        super(id, descricao, responsavel, valorHora, horas);
    }
    @Override public String getTipo() { return "Avulsa"; }
    @Override public double calcularTotal() {
        return getValorHora() * getHoras();
    }
}
