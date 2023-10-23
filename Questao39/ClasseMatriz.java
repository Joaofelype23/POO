package Questao39;

public class ClasseMatriz {
    private float[][] matriz = new float[2][2];

    public ClasseMatriz(float a, float b, float c, float d) {
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[1][0] = c;
        matriz[1][1] = d;
    }

    public void calDeterminante() {
        System.out.println();
        System.out.println("Determinante = " + (matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]));
    }

    public void imprimeMatriz() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
