package com.roadjava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] dias = new int[2][2];

        dias[0][0] = 1;
        dias[0][1] = 10;
        dias[1][0] = 2;
        dias[1][1] = 20;
//        dias[2][0] = 3;
//        dias[2][1] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        //Com forEach
        for (int[] arrayBase: dias) {
            for (int numero: arrayBase) {
                System.out.println(numero);
            }
        }
    }
}
