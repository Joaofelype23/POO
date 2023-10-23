package Questao47;

public class Main {
    public static void main(String[] args) {
        Tecnico x1 = new Tecnico("joao", 1350.0, 123456, 100.0);

        System.out.println(x1);

        System.out.println(x1.ganhoAnual());

        Administrativo x2 = new Administrativo("Pedro", 1000.0, 987654, "noite", 100.0);

        System.out.println(x2);

        System.out.println(x2.ganhoAnual());
    }
}
