package atividade;

public class Cliente extends Pessoa {

    // atributos
    private String telefone;
    private String endereco;
    private int idCliente;


    // construtor vazio
    public Cliente() {
        super();
    }

    // construtor
    public Cliente(String nome, int idade, String cpf, String telefone, String endereco, int idCliente) {
        super(nome, idade, cpf);
        this.telefone = telefone;
        this.endereco = endereco;
        this.idCliente = idCliente;
    }

    // GETTERS
    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    // SETTERS
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    // método para exibir os dados do cliente
    @Override
    public void exibirDados() {
        System.out.println("ID do Cliente: " + idCliente);
        super.exibirDados();
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);    
    }

    
}
