package atividade;

import java.util.Date;

public class Vendedor extends Funcionario {
    // atributos
    private float comissao;
    private int totalVendas;
    private float metaVendas;

    // construtor vazio
    public Vendedor() {
    
    }

    // construtor
    public Vendedor(String nome, int idade, String cpf, String setor, Date dataAdmissao, double salario, String nivelCargo, int idFuncionario, float comissao, int totalVendas, float metaVendas) {
    super(nome, idade, cpf, setor, dataAdmissao, salario, nivelCargo, idFuncionario);
    this.comissao = comissao;
    this.totalVendas = totalVendas;
    this.metaVendas = metaVendas;
}

    // getters
    public float getComissao() {
        return comissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public float getMetaVendas() {
        return metaVendas;
    }

    // setters
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }

    // método para exibir os dados do vendedor
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Comissão: " + comissao);
        System.out.println("Total de Vendas: " + totalVendas);
        System.out.println("Meta de Vendas: " + metaVendas);
    }


}
