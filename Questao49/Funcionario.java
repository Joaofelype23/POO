package Questao49;

public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private double salarioTotal;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2.0;
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
    }

    public void SalarioFinal(int horasDeTrabalho) {
        this.salarioTotal = salarioPorHora * horasDeTrabalho;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salarioPorHora=" + salarioPorHora + ", salarioTotal=" + salarioTotal
                + "]";
    }

}
