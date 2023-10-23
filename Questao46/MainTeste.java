package Questao46;

public class MainTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 38);
        Politico politico = new Politico("Victor", 42, "PSE");
        Prefeito prefeito = new Prefeito("Ana", 40, "PL", "Pau Dos Ferros");
        Governador governador = new Governador("Fabio", 50, "PLS", "Rio Grande Do Norte");

        System.out.println(pessoa);
        System.out.println();
        System.out.println(politico);
        System.out.println();
        System.out.println(prefeito);
        System.out.println();
        System.out.println(governador);
    }
}
