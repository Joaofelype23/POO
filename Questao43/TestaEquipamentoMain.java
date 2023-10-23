package Questao43;

public class TestaEquipamentoMain {
    public static void main(String[] args) {
        Equipamento q1 = new Equipamento("notebook", "lenovo");

        System.out.println(q1);

        Computador c1 = new Computador("notebook", "lenovo", 15.6, 590);
        System.out.println(c1);

    }
}
