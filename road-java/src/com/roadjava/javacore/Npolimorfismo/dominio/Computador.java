package com.roadjava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

    public static final double  IMPOSTO_COMPUTADOR = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_COMPUTADOR;
    }


}
