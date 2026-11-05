package estudo.t16.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ConsumoResidencial extends Consumo {
    public ConsumoResidencial(int id, String descricao, Unidade responsavel,
                 double tarifa, int kwh) {
        super(id, descricao, responsavel, tarifa, kwh);
    }
    @Override public String getTipo() { return "Residencial"; }
    @Override public double calcularTotal() {
        return getTarifa() * getKwh();
    }
}
