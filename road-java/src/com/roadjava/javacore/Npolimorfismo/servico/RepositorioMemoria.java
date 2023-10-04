package com.roadjava.javacore.Npolimorfismo.servico;

import com.roadjava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no repositório de memória");
    }
}
