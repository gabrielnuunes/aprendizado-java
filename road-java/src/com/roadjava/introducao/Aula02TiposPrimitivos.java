package com.roadjava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean
        int idade = 30;
        long numeroGrande = 10000000L;
        double salario = 2000.0D;
        float salarioFloat = 2500F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean falso = false;
        boolean verdadeiro = true;
        char caractere = 'M';

        // String não é um tipo primitivo ela é uma classe
        String nome = "Nome completo aqui";

        System.out.println("A idade é " + idade);
        System.out.println(nome);
    }
}
