package estudo.t14.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class ServicoEmergencial extends OrdemServico {
    public ServicoEmergencial(int id, String descricao, Proprietario responsavel,
                 double valorHora, int horas) {
        super(id, descricao, responsavel, valorHora, horas);
    }
    @Override public String getTipo() { return "Emergencial"; }
    @Override public double calcularTotal() {
        return getValorHora() * getHoras() * 1.5 + 100;
    }
}
