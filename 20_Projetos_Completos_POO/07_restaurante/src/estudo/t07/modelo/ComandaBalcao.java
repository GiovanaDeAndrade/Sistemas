package estudo.t07.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ComandaBalcao extends Comanda {
    public ComandaBalcao(int id, String descricao, Mesa responsavel,
                 double precoRefeicao, int refeicoes) {
        super(id, descricao, responsavel, precoRefeicao, refeicoes);
    }
    @Override public String getTipo() { return "Balcão"; }
    @Override public double calcularTotal() {
        return getPrecoRefeicao() * getRefeicoes();
    }
}
