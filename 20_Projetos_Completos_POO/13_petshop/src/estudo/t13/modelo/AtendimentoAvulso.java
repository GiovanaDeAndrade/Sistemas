package estudo.t13.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class AtendimentoAvulso extends Atendimento {
    public AtendimentoAvulso(int id, String descricao, Tutor responsavel,
                 double precoSessao, int sessoes) {
        super(id, descricao, responsavel, precoSessao, sessoes);
    }
    @Override public String getTipo() { return "Avulso"; }
    @Override public double calcularTotal() {
        return getPrecoSessao() * getSessoes();
    }
}
