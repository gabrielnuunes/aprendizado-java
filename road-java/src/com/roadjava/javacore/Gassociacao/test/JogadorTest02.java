package com.roadjava.javacore.Gassociacao.test;

import com.roadjava.javacore.Gassociacao.domain.Jogador;
import com.roadjava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
    }
}
