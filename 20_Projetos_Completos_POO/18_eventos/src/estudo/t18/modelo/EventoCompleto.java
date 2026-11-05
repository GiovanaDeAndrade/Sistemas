package estudo.t18.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class EventoCompleto extends Evento {
    public EventoCompleto(int id, String descricao, Organizador responsavel,
                 double precoPessoa, int participantes) {
        super(id, descricao, responsavel, precoPessoa, participantes);
    }
    @Override public String getTipo() { return "Completo"; }
    @Override public double calcularTotal() {
        return getPrecoPessoa() * getParticipantes() + 500 + 10 * getParticipantes();
    }
}
