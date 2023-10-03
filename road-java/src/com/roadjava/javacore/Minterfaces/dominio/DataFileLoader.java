package com.roadjava.javacore.Minterfaces.dominio;

public class DataFileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando o FileLoader");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando permissões do arquivo");
    }
}
