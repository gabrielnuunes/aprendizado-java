package com.roadjava.introducao;

public class Aula05OperadoresCondicionais01 {

    public static void main(String[] args) {

        int idade = 15;
        boolean isDeMaior = idade >= 18;

        if(isDeMaior){
            System.out.println("pode Entrar");
        } else {
            System.out.println("Não pode entrar");
        }

        if(isDeMaior){
            System.out.println("pode Entrar");
        }

        if(!isDeMaior){
            System.out.println("Não pode entrar");
        }


        
    }

}
