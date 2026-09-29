package atividade;

public class Pessoa {

    // atributos
    private String nome;
    private int idade;
    private String cpf;

    // construtor vazio
    public Pessoa() {

    }

    // construtor
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade(){
        return idade;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // método para exibir os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }



}
