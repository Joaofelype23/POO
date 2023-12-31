package Questao45;

public class Livro {
    private String nome;
    private String autor;
    private String editora;

    public Livro(String nome, String autor, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Autor=" + autor + ", Editora=" + editora;
    }

}
