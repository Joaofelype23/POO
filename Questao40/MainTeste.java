package Questao40;

import java.util.Scanner;
import java.util.ArrayList;

public class MainTeste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Clientes> clientes = new ArrayList<>();

        int id;
        String nome;
        int idade;
        int telefone;

        do {

            System.out.println("Escreva o id do cliente.");
            id = scanner.nextInt();

            if (id < 0) {
                break;
            }

            System.out.println("Escreva o nome do cliente.");
            nome = scanner.next();
            System.out.println("Escreva a idade do cliente.");
            idade = scanner.nextInt();
            System.out.println("Escreva o telefone do cliente.");
            telefone = scanner.nextInt();

            Clientes Clientes = new Clientes(id, nome, idade, telefone);

            clientes.add(Clientes);

        } while (true);

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }

        scanner.close();
    }
}
