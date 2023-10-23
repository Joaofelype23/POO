package Questao47;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentaSalario(double aumento) {
        this.salario += aumento;
    }

    public double ganhoAnual() {
        return this.salario * 13;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Salario=" + salario;
    }

}
