package Questao45;

public class TesteMain {
    public static void main(String[] args) {
        LivroBiblioteca l1 = new LivroBiblioteca("VBSA", "Pedro Pessoa", "Seguinte", 12345, false);
        System.out.println(l1);

        LivroLivraria l2 = new LivroLivraria("Crepusculo", "Anitta", "Paralela", 12345, 35.99, 8);
        System.out.println(l2);
    }
}
