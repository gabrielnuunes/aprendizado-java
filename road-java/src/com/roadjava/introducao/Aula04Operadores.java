package com.roadjava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        // + - / *
        double num1 = 10;
        double num2 = 20;

        double result = num1 * num2;
        System.out.println(result);

        // Resto %
        int rest = 22 % 2;
        System.out.println(rest);

        // Opera lógicos
        // < > >= <= == !=
        boolean isDezMaiorQueVIntente = 10 > 20;
        boolean isDezMenorQueVInte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteAVinte = 10 != 20;

        System.out.println("Dez é maior que vinte " + isDezMaiorQueVIntente);
        System.out.println("Dez é menor que vinte " + isDezMenorQueVInte);
        System.out.println("Dez é igual que vinte " + isDezIgualAVinte);
        System.out.println("Dez é diferente que vinte " + isDezDiferenteAVinte);

        // Operadores lógicos
        // && || !

        int idade = 28;
        float salario = 4000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation5 = 5000F;
        boolean isPlayStation5Compravel = valorTotalContaCorrente > valorPlayStation5 || valorTotalContaPoupanca > valorPlayStation5;
        System.out.println("O PlayStation é comprável " + isPlayStation5Compravel);
    }

}
