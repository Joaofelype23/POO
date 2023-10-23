//package QUESTAO28;

public class TesteFatura {
    public static void main(String[] args) {
        // Criar uma instância da Fatura
        Fatura fatura1 = new Fatura("1234", "Teclado", 2, 29.99);

        // Exibir informações da fatura
        System.out.println("Número de Identificação: " + fatura1.getNumeroIdentificacao());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura1.getQuantidadeComprada());
        System.out.println("Preço Unitário: " + fatura1.getPrecoUnitario());
        System.out.println("Total da Fatura: " + fatura1.calculaTotal());

        // Criar outra instância da Fatura com quantidade e preço negativos
        Fatura fatura2 = new Fatura("5678", "Mouse", -1, -19.99);

        // Exibir informações da segunda fatura
        System.out.println("\nNúmero de Identificação: " + fatura2.getNumeroIdentificacao());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura2.getQuantidadeComprada());
        System.out.println("Preço Unitário: " + fatura2.getPrecoUnitario());
        System.out.println("Total da Fatura: " + fatura2.calculaTotal());
    }
}