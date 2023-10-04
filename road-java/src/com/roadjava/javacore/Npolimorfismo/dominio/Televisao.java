package com.roadjava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{

    public static final double  IMPOSTO_TELEVISAO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_TELEVISAO;
    }


}
