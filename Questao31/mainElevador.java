public class mainElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(2, 3);

        elevador.Entrar();
        elevador.Sobe();
        elevador.Entrar();
        elevador.Sobe();

        elevador.Imprime();
        System.out.println("\n");

        elevador.Entrar();
        elevador.Entrar();

        System.out.println("\n");

        elevador.Sair();
        elevador.Imprime();



    }
}
