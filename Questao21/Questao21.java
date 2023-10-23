import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contagem = 0;

        System.out.printf("Escreva um numero para saber se ele e primo ou nao.\n");
        int x = entrada.nextInt();

        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                contagem++;
            }
        }

        if (contagem == 1) {
            System.out.printf("O numero e primo.\n");
        } else if (contagem != 1) {
            System.out.printf("O numero nao e primo.\n");
        }

        entrada.close();
    }
}
