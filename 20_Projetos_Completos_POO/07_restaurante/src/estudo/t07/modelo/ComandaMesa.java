package estudo.t07.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ComandaMesa extends Comanda {
    public ComandaMesa(int id, String descricao, Mesa responsavel,
                 double precoRefeicao, int refeicoes) {
        super(id, descricao, responsavel, precoRefeicao, refeicoes);
    }
    @Override public String getTipo() { return "Mesa"; }
    @Override public double calcularTotal() {
        return getPrecoRefeicao() * getRefeicoes() * 1.10;
    }
}
