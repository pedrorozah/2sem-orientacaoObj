package atividade;

import java.util.Date;

public class Gerente extends Funcionario {
    // atributos
    private int quantidadeFuncionarios;
    private double bonusAnual;

    // construtor vazio
    public Gerente() {
    
    }

    // construtor
    public Gerente(String nome, int idade, String cpf, String setor, Date dataAdmissao, double salario, String nivelCargo, int idFuncionario, int quantidadeFuncionarios, double bonusAnual) {
        super(nome, idade, cpf, setor, dataAdmissao, salario, nivelCargo, idFuncionario);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.bonusAnual = bonusAnual;
    }

    // getters
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    // setters
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    // método para exibir os dados do gerente
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de Funcionários: " + quantidadeFuncionarios);
        System.out.println("Bônus Anual: " + bonusAnual);
    }

    
}
