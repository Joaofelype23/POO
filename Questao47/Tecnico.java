package Questao47;

public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, double salario, double matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double ganhoAnual() {
        return (getSalario() + bonus) * 13;
    }

}
