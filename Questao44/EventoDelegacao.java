package Questao44;

public class EventoDelegacao {
    private DataHora datahora;
    private String evento;

    public EventoDelegacao(DataHora datahora, String evento) {
        this.datahora = datahora;
        this.evento = evento;
    }

    @Override
    public String toString() {
        return datahora + ", Evento=" + evento;
    }

}
