package com.roadjava.javacore.Bintroducaometodos.test;

import com.roadjava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{2000,3000,4000});
        funcionario.imprime();
    }
}
