package estudo.t06.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ReservaStandard extends Reserva {
    public ReservaStandard(int id, String descricao, Hospede responsavel,
                 double diaria, int noites) {
        super(id, descricao, responsavel, diaria, noites);
    }
    @Override public String getTipo() { return "Standard"; }
    @Override public double calcularTotal() {
        return getDiaria() * getNoites();
    }
}
