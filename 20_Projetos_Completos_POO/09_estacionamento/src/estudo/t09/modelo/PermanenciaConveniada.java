package estudo.t09.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class PermanenciaConveniada extends Permanencia {
    public PermanenciaConveniada(int id, String descricao, Motorista responsavel,
                 double valorHora, int horas) {
        super(id, descricao, responsavel, valorHora, horas);
    }
    @Override public String getTipo() { return "Conveniada"; }
    @Override public double calcularTotal() {
        return getValorHora() * Math.max(0, getHoras() - 1) * 0.8;
    }
}
