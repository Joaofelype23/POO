package Questao45;

public class LivroLivraria extends Livro {
    private int codigo;
    private double preco;
    private int estoque;

    public LivroLivraria(String nome, String autor, String editora, int codigo, double preco, int estoque) {
        super(nome, autor, editora);
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return super.toString() + ", Codigo=" + codigo + ", Preco=" + preco + ", Estoque=" + estoque;
    }

}
