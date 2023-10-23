package Questao44;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, int segundo, String evento) {
        super(dia, mes, ano, hora, minuto, segundo);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Evento=" + evento + ", " + super.toString();
    }

}
