package com.roadjava.javacore.Csobrecargametodos.test;

import com.roadjava.javacore.Csobrecargametodos.dominio.Serie;

public class SerieTest01 {

    public static void main(String[] args) {
        Serie serie = new Serie();
//        serie.setEpisodio(12);
//        serie.setTipo("TV");
//        serie.setNome("Two and a Half man");

        serie.init("Outlander", "Netflix", 14, "Aventura");
        serie.imprime();

    }
}
