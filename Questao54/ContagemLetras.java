package Questao54;

import java.util.Map;
import java.util.TreeMap;

public class ContagemLetras {
    public static void main(String[] args) {
        String texto = "HELLO THERE";

        Map<Character, Integer> contagemLetras = new TreeMap<>();

        for (char letra : texto.toCharArray()) {
            if (Character.isLetter(letra)) {
                letra = Character.toUpperCase(letra);

                contagemLetras.put(letra, contagemLetras.getOrDefault(letra, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : contagemLetras.entrySet()) {
            char letra = entry.getKey();
            int contagem = entry.getValue();
            System.out.println(letra + ": " + contagem);
        }
    }
}
