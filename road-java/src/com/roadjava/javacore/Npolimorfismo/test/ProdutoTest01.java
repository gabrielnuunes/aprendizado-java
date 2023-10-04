package com.roadjava.javacore.Npolimorfismo.test;

import com.roadjava.javacore.Npolimorfismo.dominio.Computador;
import com.roadjava.javacore.Npolimorfismo.dominio.Tomate;
import com.roadjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {
        Computador computador = new Computador("Core I5-8500", 2000.00);
        Tomate tomate = new Tomate("Pequeno", 5);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("-------------------------------");


    }
}
