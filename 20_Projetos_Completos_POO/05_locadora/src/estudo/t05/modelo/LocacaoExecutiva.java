package estudo.t05.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class LocacaoExecutiva extends Locacao {
    public LocacaoExecutiva(int id, String descricao, Cliente responsavel,
                 double diaria, int dias) {
        super(id, descricao, responsavel, diaria, dias);
    }
    @Override public String getTipo() { return "Executiva"; }
    @Override public double calcularTotal() {
        return getDiaria() * getDias() + 40 * getDias();
    }
}
