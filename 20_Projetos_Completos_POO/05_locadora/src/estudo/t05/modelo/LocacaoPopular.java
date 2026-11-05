package estudo.t05.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class LocacaoPopular extends Locacao {
    public LocacaoPopular(int id, String descricao, Cliente responsavel,
                 double diaria, int dias) {
        super(id, descricao, responsavel, diaria, dias);
    }
    @Override public String getTipo() { return "Popular"; }
    @Override public double calcularTotal() {
        return getDiaria() * getDias();
    }
}
