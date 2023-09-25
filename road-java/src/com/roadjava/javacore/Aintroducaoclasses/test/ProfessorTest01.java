package com.roadjava.javacore.Aintroducaoclasses.test;

import com.roadjava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Algum";
        professor.email = "algum@email.com";
        professor.idade = 20;

        System.out.println(professor.email);
        System.out.println(professor.nome);
        System.out.println(professor.idade);
    }
}
