package atividade;

import java.util.Date;

public class Caixa extends Funcionario {
    // atributos
    private String turno;
    private double comissao;

    // construtor vazio
    public Caixa() {
    
    }

    // construtor
    public Caixa(String nome, int idade, String cpf, String setor, Date dataAdmissao, double salario, String nivelCargo, int idFuncionario, String turno, double comissao) {
        super(nome, idade, cpf, setor, dataAdmissao, salario, nivelCargo, idFuncionario);
        this.turno = turno;
        this.comissao = comissao;
    }

    // getters
    public String getTurno() {
        return turno;
    }

    public double getComissao() {
        return comissao;
    }

    // setters
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // método para exibir os dados do caixa
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Turno: " + turno);
        System.out.println("Comissão: " + comissao);
    }
    
}
