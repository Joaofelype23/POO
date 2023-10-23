public class Contador {

    private int valorCont;


    public Contador(int valorInicial){
        this.valorCont = valorInicial;
    }

    public void Zerar(){
        this.valorCont = 0;
    }

    public void Incrementar(){
        this.valorCont++;
    }

    public void Incrementar(int x){
        this.valorCont += x;
    }

    public void Imprimir(){
        System.out.println("O valor do contador é: " + this.valorCont);
    }

}
