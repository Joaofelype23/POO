public class mainContador {
    public static void main(String[] args) {
        Contador cont = new Contador(1000);

        cont.Imprimir();

        cont.Incrementar();
        cont.Imprimir();

        cont.Zerar();
        cont.Imprimir();

        cont.Incrementar(5);
        cont.Imprimir();
    }
}
