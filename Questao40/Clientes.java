package Questao40;

public class Clientes {
    private int id;
    private String nome;
    private int idade;
    private int telefone;

    public Clientes(int id, String nome, int idade, int telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: Id=" + id + ", Nome=" + nome + ", Idade=" + idade + ", Telefone=" + telefone;
    }

}
