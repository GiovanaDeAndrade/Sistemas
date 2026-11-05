package estudo.t10.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class FreteNormal extends Frete {
    public FreteNormal(int id, String descricao, Destinatario responsavel,
                 double precoQuilo, int quilos) {
        super(id, descricao, responsavel, precoQuilo, quilos);
    }
    @Override public String getTipo() { return "Normal"; }
    @Override public double calcularTotal() {
        return getPrecoQuilo() * getQuilos() + 10;
    }
}
