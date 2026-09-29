package atividade;

import java.util.Date;

public class Funcionario extends Pessoa {
    // atributos
    private String setor;
    private Date dataAdmissao;
    private double salario;
    private String nivelCargo;
    private int idFuncionario;

    // construtor vazio
    public Funcionario() {
        super();
    }

    // construtor
    public Funcionario(String nome, int idade, String cpf, String setor, Date dataAdmissao, double salario, String nivelCargo, int idFuncionario) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.nivelCargo = nivelCargo;
        this.idFuncionario = idFuncionario;
    }

    // getters
    public String getSetor() {
        return setor;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    // setters
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int setNivelCargo(int nivelCargo) {
        
        switch (nivelCargo) {
            case 1:
                this.nivelCargo = "Estagiário";
                break;
            case 2:
                this.nivelCargo = "Júnior";
                break;
            case 3:
                this.nivelCargo = "Pleno";
                break;
            case 4:
                this.nivelCargo = "Sênior";
                break;

            default:
                System.out.println("Nível de cargo inválido.");       
                return 0;
        }

        return 1;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    // método para exibir dados do funcionário
    @Override 
    public void exibirDados() {
        System.out.println("ID do Funcionário: " + idFuncionario);
        super.exibirDados();
        System.out.println("Setor: " + setor);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Salário: R$" + salario);
        System.out.println("Nível do Cargo: " + nivelCargo);
    }

}
