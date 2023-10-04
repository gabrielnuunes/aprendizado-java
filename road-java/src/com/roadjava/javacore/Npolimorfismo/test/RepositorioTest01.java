package com.roadjava.javacore.Npolimorfismo.test;

import com.roadjava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.roadjava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.salvar();
    }
}
