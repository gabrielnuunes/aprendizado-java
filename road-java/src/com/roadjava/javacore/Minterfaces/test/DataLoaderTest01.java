package com.roadjava.javacore.Minterfaces.test;

import com.roadjava.javacore.Minterfaces.dominio.DataBaseLoader;
import com.roadjava.javacore.Minterfaces.dominio.DataFileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        DataFileLoader dataFileLoader = new DataFileLoader();

        dataBaseLoader.load();
        dataFileLoader.load();

        dataBaseLoader.checkPermissions();
        dataFileLoader.checkPermissions();
    }
}
