package com.roadjava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa {

    private String salario;

    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorio() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
