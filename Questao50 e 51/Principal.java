package Questao50e51;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new Circulo();
        FiguraGeometrica f2 = new Quadrado();
        FiguraGeometrica f3 = new Triangulo();

        f1.desenha();
        f2.desenha();
        f3.desenha();

        System.out.println();
        System.out.println();

        Desenho d1 = new Desenho(f1, f2, 10, 10, 20, 20);
        Desenho d2 = new Desenho(f3, f1, 5, 5, 12, 12);

        d1.imprime();
        d2.imprime();
    }
}
