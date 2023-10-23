package Questao43;

public class Computador extends Equipamento {
    private double tamanhoTela;
    private double pesoComp;

    public Computador(String nome, String marca, double tamanhoTela, double pesoComp) {
        super(nome, marca);
        this.tamanhoTela = tamanhoTela;
        this.pesoComp = pesoComp;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getPesoComp() {
        return pesoComp;
    }

    public void setPesoComp(double pesoComp) {
        this.pesoComp = pesoComp;
    }

    public String toString() {
        return super.toString() + ", Tamanho da Tela = " + tamanhoTela + " polegadas" + ", Peso do Computador = "
                + pesoComp
                + "g";
    }

}
