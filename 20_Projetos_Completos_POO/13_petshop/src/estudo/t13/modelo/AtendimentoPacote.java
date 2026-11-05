package estudo.t13.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class AtendimentoPacote extends Atendimento {
    public AtendimentoPacote(int id, String descricao, Tutor responsavel,
                 double precoSessao, int sessoes) {
        super(id, descricao, responsavel, precoSessao, sessoes);
    }
    @Override public String getTipo() { return "Pacote"; }
    @Override public double calcularTotal() {
        return getPrecoSessao() * getSessoes() - getPrecoSessao() * (getSessoes() / 3);
    }
}
