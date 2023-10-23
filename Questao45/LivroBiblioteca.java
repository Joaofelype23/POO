package Questao45;

public class LivroBiblioteca extends Livro {
    private int codigo;
    private boolean emprestado;

    public LivroBiblioteca(String nome, String autor, String editora, int codigo, boolean emprestado) {
        super(nome, autor, editora);
        this.codigo = codigo;
        this.emprestado = emprestado;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Codigo=" + codigo + ", Emprestado=" + emprestado;
    }

}
