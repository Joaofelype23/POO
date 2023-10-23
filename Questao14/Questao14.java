import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1 = 1, num2 = 0;

        System.out.printf("Escreva o numero de termos para ser apresentada a sequencia de Fibonacci.\n");
        int x = entrada.nextInt();

        System.out.println("\n\n" + num2);
        System.out.println(num1);
        
        for(int i = 0; i < (x-2); i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
        entrada.close();
    }
}
