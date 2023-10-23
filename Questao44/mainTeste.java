package Questao44;

public class mainTeste {
    public static void main(String[] args) {
        DataHora datahora = new DataHora(23, 04, 2024, 23, 30, 15);
        EventoDelegacao evento1 = new EventoDelegacao(datahora, "Aniversario");
        EventoHeranca evento2 = new EventoHeranca(24, 8, 2024, 18, 30, 15, "Formatura");

        System.out.println();
        System.out.println(evento1);
        System.out.println();
        System.out.println(evento2);
        System.out.println();
    }
}
