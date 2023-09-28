package com.roadjava.javacore.Gassociacao.test;

import com.roadjava.javacore.Gassociacao.domain.Jogador;
import com.roadjava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Kaka");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador");
        jogador.imprime();

        System.out.println("--- Time");
        jogador.imprime();
    }
}
