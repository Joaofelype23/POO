package Questao47;

public class Assistente extends Funcionario {
    private double matricula;

    public Assistente(String nome, double salario, double matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matricula=" + matricula;
    }

}
