package Questao50e51;

public class Desenho {
    private FiguraGeometrica f1;
    private FiguraGeometrica f2;
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;

    public Desenho(FiguraGeometrica f1, FiguraGeometrica f2, int x1, int y1, int x2, int y2) {
        this.f1 = f1;
        this.f2 = f2;
        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
    }

    public void imprime() {
        System.out.println("Coordenadas " + X1 + " " + Y1);
        f1.desenha();
        System.out.println("Coordenadas " + X2 + " " + Y2);
        f2.desenha();
    }

}
