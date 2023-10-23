public class Elevador {
    private int numAndares;
    private int andarAtual;
    private int capacidadeElevador;
    private int pessoasNoElevador;


    public Elevador(int numAndares, int capacidadeElevador) {
        this.numAndares = numAndares;
        this.andarAtual = 0;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasNoElevador = 0;
    }

    public void Entrar(){
        if(pessoasNoElevador < capacidadeElevador){
            pessoasNoElevador++;
        }else if(pessoasNoElevador >= capacidadeElevador){
            System.out.println("Elevador cheio.");
        }
    }

    public void Sair(){
        if(pessoasNoElevador > 0){
            pessoasNoElevador--;
        }else if(pessoasNoElevador <= 0){
            System.out.println("O elevador está vazio.");
        }
    }

    public void Sobe(){
        if(andarAtual != numAndares){
            andarAtual++;
        }else if(andarAtual == numAndares){
            System.out.println("Voce já está no andar mais alto.");
        }
    }

    public void Desce(){
        if(andarAtual <= 0){
            System.out.println("Voce já está no andar mais baixo.");
        }else if(andarAtual >= 0){
            andarAtual--;
        }
    }

    public void Imprime(){
        System.out.println("Há " + pessoasNoElevador + " pessoas no elevador.");
        System.out.println("E voce está no " + andarAtual + " andar.");
    }

}
