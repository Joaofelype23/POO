package Questao47;

public class Administrativo extends Assistente {
    private String turno;
    private double adicional;

    public Administrativo(String nome, double salario, double matricula, String turno, double adicional) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicional = adicional;
    }

    public double ganhoAnual() {
        if (turno == "noite") {
            return (getSalario() + adicional) * 12 + getSalario();
        } else {
            return getSalario() * 13;
        }

    }
}
