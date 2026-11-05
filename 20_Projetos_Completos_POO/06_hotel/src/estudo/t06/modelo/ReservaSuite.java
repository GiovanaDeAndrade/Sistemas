package estudo.t06.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ReservaSuite extends Reserva {
    public ReservaSuite(int id, String descricao, Hospede responsavel,
                 double diaria, int noites) {
        super(id, descricao, responsavel, diaria, noites);
    }
    @Override public String getTipo() { return "Suíte"; }
    @Override public double calcularTotal() {
        return getDiaria() * getNoites() * 1.25 + 50;
    }
}
