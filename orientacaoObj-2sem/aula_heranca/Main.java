package atividade;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criando instâncias dos objetos
        Caixa caixa = new Caixa("Pedro", 25, "111.222.333-44", "Caixa", new java.util.Date(), 2000.0, "Estagiário", 2, "Manhã", 150.0);
        Pessoa pessoa = new Pessoa("João", 30, "123.456.789-00");
        Funcionario funcionario = new Funcionario("Maria", 28, "987.654.321-00", "Vendas", new java.util.Date(), 3000.0, "Pleno", 1);
        Gerente gerente = new Gerente("Ana", 35, "555.666.777-88", "Gerência", new java.util.Date(), 5000.0, "Júnior", 3, 10, 10000.0);
        Vendedor vendedor = new Vendedor("Carlos", 32, "444.555.666-77", "Vendas", new java.util.Date(), 4000.0, "Pleno", 4, 0.1f, 50, 100.0f);

        // Exibindo os dados
        System.out.println("Dados do Gerente:");
        gerente.exibirDados();

        System.out.println("\nDados do Caixa:");
        caixa.exibirDados();

        System.out.println("\nDados do Funcionário:");
        funcionario.exibirDados();

        System.out.println("\nDados do Vendedor:");
        vendedor.exibirDados();

        System.out.println("\nDados da Pessoa:");
        pessoa.exibirDados();
    }
}
