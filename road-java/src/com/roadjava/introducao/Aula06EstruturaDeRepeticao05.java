package com.roadjava.introducao;

public class Aula06EstruturaDeRepeticao05 {

    public static void main(String[] args) {

        // If com Continue

        int valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorTotal < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
