
public class Questao30 {

    String matricula;
    String nome;
    double n1;
    double n2;
    double t1;

    public Questao30(String matricula, String nome, double n1, double n2, double t1) {
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.t1 = t1;
    }

    public Questao30(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void recebeNotas(double n1, double n2, double t1){
        this.n1 = n1;
        this.n2 = n2;
        this.t1 = t1;
    }

    public double media() {

        return ((2.5 * n1) + (2.5 * n2) + (2.0 * t1)) / 7.0;

    }

    public static double provaFinal(double x) {
        if (x < 3.5) {
            return 0;
        } else {
            double provaFinal = (50 - 6 * x) / 4;

            return provaFinal;
        }
    }

    @Override
    public String toString() {
        return "Questao30 [matricula=" + matricula + ", nome=" + nome + ", n1=" + n1 + ", n2=" + n2 + ", t1=" + t1
                + "]";
    }

    
}