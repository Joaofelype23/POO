package Questao38;

public class EntradaEmAgenda {
    private double hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(double hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "EntradaEmAgenda [hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", assunto="
                + assunto + "]";
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }

}
