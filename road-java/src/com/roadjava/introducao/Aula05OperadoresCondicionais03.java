package com.roadjava.introducao;

public class Aula05OperadoresCondicionais03 {

    public static void main(String[] args) {

        // Operador ternário
        // (condicao) ? verdadeiro : falso

        double salario = 6000;

        String mensagemDoar = "Eu vou doar 100";
        String mensagemNaoDoar = "Eu não vou doar dinheiro";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
