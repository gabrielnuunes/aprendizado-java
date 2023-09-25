package com.roadjava.javacore.Aintroducaoclasses.test;

import com.roadjava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.nome = "Volks";
        carro.ano = 2019;

        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println(carro.nome);
    }
}
