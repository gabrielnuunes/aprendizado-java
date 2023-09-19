package com.roadjava.introducao;

public class Aula05EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        //while, do while, for

        // While
        int count = 0;
        while(count <= 10) {
            System.out.println(count);
            count++;
        }

        //Do while
        int contador = 0;
        do {
            System.out.println("Dentro do do-while");
            contador++;
        } while (contador <= 10);

        // For
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

    }
}
