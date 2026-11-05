package estudo.t16.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ConsumoComercial extends Consumo {
    public ConsumoComercial(int id, String descricao, Unidade responsavel,
                 double tarifa, int kwh) {
        super(id, descricao, responsavel, tarifa, kwh);
    }
    @Override public String getTipo() { return "Comercial"; }
    @Override public double calcularTotal() {
        return getTarifa() * getKwh() + 30;
    }
}
