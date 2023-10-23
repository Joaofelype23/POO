import java.util.Scanner;

public class mainQuestao30 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o nome do aluno.");
        String nome = entrada.nextLine();
        System.out.println("Escreva a matricula desse aluno.");
        String matricula = entrada.nextLine();
        System.out.println("Escreva os 3 notas desse aluno.");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double t1 = entrada.nextDouble();
        
        Questao30 aluno = new Questao30(matricula, nome, n1, n2, t1);

        double media = aluno.media();
        System.out.println("A média do aluno é " + media);
        
        double mediaFinal = Questao30.provaFinal(media);

        // if(mediaFinal == 0){
        //     System.out.println("Aluno se fudeu.");
        // }else{
        //     System.out.println("Ele precisa de " + mediaFinal);
        // }

        System.out.println(mediaFinal == 0? "Reprovado": "Precisa de " + mediaFinal);




        entrada.close();
    }
}