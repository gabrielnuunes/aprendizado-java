package com.roadjava.javacore.Dconstrutores.test;

import com.roadjava.javacore.Dconstrutores.dominio.Serie;

public class SerieTest01 {

    public static void main(String[] args) {
        Serie serie = new Serie("Outlander", "Netflix", 14, "Aventura");
        serie.imprime();

        Serie serie1 = new Serie();
        serie.imprime();

//        serie.setEpisodio(12);
//        serie.setTipo("TV");
//        serie.setNome("Two and a Half man");
//        System.out.println(serie);

//        serie.init("Outlander", "Netflix", 14, "Aventura");

    }
}
