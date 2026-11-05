package estudo.t18.modelo;

/** ADAPTE a formula de calcularTotal conforme o enunciado. */
public class EventoSimples extends Evento {
    public EventoSimples(int id, String descricao, Organizador responsavel,
                 double precoPessoa, int participantes) {
        super(id, descricao, responsavel, precoPessoa, participantes);
    }
    @Override public String getTipo() { return "Simples"; }
    @Override public double calcularTotal() {
        return getPrecoPessoa() * getParticipantes();
    }
}
