package estudo.t10.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class FreteExpresso extends Frete {
    public FreteExpresso(int id, String descricao, Destinatario responsavel,
                 double precoQuilo, int quilos) {
        super(id, descricao, responsavel, precoQuilo, quilos);
    }
    @Override public String getTipo() { return "Expresso"; }
    @Override public double calcularTotal() {
        return getPrecoQuilo() * getQuilos() * 1.5 + 20;
    }
}
