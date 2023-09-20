package com.roadjava.introducao;

public class Aula07Arrays02 {

    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;


        String[] nomes = new String[4];
        nomes[0] = "Gabriel";
        nomes[1] = "Gabriela";
        nomes[2] = "Gabriele";
        nomes[3] = "Gabriely";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
