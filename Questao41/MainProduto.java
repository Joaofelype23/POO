package Questao41;

public class MainProduto {
    public static void main(String[] args) {

        int[] lista1 = { 2, 3, 4 };
        int[] lista2 = { 2, 3, 4, 5 };
        int[] lista3 = { 5, 6, 4, 5, 10 };

        System.out.println(produto(lista1));
        System.out.println(produto(lista2));
        System.out.println(produto(lista3));

    }

    public static int produto(int[] lista) {

        int p = 1;
        for (int i = 0; i < lista.length; i++) {
            p *= lista[i];
        }

        return p;
    }
}
