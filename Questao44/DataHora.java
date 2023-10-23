package Questao44;

public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    private int segundo;

    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Dia=" + dia + ", Mes=" + mes + ", Ano=" + ano + ", Hora=" + hora + ", minuto=" + minuto
                + ", Segundo=" + segundo;
    }

}
