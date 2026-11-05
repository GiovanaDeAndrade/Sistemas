package estudo.t14.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ServicoPreventivo extends OrdemServico {
    public ServicoPreventivo(int id, String descricao, Proprietario responsavel,
                 double valorHora, int horas) {
        super(id, descricao, responsavel, valorHora, horas);
    }
    @Override public String getTipo() { return "Preventivo"; }
    @Override public double calcularTotal() {
        return getValorHora() * getHoras();
    }
}
