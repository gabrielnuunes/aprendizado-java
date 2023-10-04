package com.roadjava.javacore.Npolimorfismo.test;

import com.roadjava.javacore.Npolimorfismo.dominio.Computador;
import com.roadjava.javacore.Npolimorfismo.dominio.Televisao;
import com.roadjava.javacore.Npolimorfismo.dominio.Tomate;
import com.roadjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {
        Computador computador = new Computador("Core I5-8500", 2000.00);
        Tomate tomate = new Tomate("Pequeno", 5);
        Televisao televisao = new Televisao("Samsung 50\" ", 4000.00);
        tomate.setDataValidade("12/12/2023");


        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
