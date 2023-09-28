package com.roadjava.javacore.Hherenca.test;

import com.roadjava.javacore.Hherenca.dominio.Endereco;
import com.roadjava.javacore.Hherenca.dominio.Funcionario;
import com.roadjava.javacore.Hherenca.dominio.Pessoa;

public class HerencaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("545454554");

        Pessoa pessoa = new Pessoa("Fulano");
        pessoa.setNome("Fulano");
        pessoa.setCpf("9879898798");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------------");

        Funcionario funcionario = new Funcionario("Fulano 0101");
        funcionario.setNome("Funcionário 1");
        funcionario.setCpf("969696");
        funcionario.setEndereco(endereco);
        funcionario.setSalario("3000");
        funcionario.imprime();
        funcionario.relatorio();

    }
}
