package com.roadjava.javacore.Eblocosdeinicializacao.test;

import com.roadjava.javacore.Eblocosdeinicializacao.domain.Serie;

public class SerieTest01 {

    public static void main(String[] args) {
        Serie serie = new Serie();

        for ( int episodio: serie.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
