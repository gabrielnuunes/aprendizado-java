package com.roadjava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando o DataLoader");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de dados");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando permissões do banco de dados");
    }
}
