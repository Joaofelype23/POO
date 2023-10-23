package Questao55;

import java.util.Stack;

public class VerificarBalanceamento {
    public static boolean verificaBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                    pilha.pop();
                }
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String expressao1 = "((()))";
        String expressao2 = "(()())";
        String expressao3 = "(()))(";

        System.out.println("Expressão 1 está balanceada? " + verificaBalanceamento(expressao1));
        System.out.println("Expressão 2 está balanceada? " + verificaBalanceamento(expressao2));
        System.out.println("Expressão 3 está balanceada? " + verificaBalanceamento(expressao3));
    }
}
