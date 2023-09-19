package com.roadjava.introducao;

public class Aula05OperadoresCondicionais02 {

    public static void main (String[]args){
        // idade < 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = -5;

        if(idade < 15) {
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        } else if (idade >= 18) {
            System.out.println("Categoria adulto");
        } else {
            System.out.println("Idade inválida");
        }



    }

}
