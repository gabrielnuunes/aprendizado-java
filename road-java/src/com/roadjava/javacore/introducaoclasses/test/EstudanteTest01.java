package com.roadjava.javacore.introducaoclasses.test;

import com.roadjava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Gabriel";
        estudante1.idade = 30;
        estudante1.sexo = 'M';

        System.out.println("Nome: " + estudante1.nome);
        System.out.println("Sexo: " + estudante1.sexo);
        System.out.println("Idade: " + estudante1.idade);
    }
}
