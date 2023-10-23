package Questao53;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> listaOriginal = new LinkedList<>();
        for (char c = 'A'; c <= 'J'; c++) {
            listaOriginal.add(c);
        }

        LinkedList<Character> listaInversa = new LinkedList<>();

        for (int i = listaOriginal.size() - 1; i >= 0; i--) {
            char elemento = listaOriginal.get(i);
            listaInversa.add(elemento);
        }

        System.out.println("Lista Original:");
        for (char elemento : listaOriginal) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Lista Inversa:");
        for (char elemento : listaInversa) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
