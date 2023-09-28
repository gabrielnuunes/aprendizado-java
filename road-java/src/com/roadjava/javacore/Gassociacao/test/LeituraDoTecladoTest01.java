package com.roadjava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite seu email");
        String email = entrada.nextLine();
//        System.out.println("Digite M ou F para sexo");
//        char sexo = entrada.nextLine().charAt(0);

        System.out.println("_______________________");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Email " + email);

    }
}
