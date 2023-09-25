package com.roadjava.javacore.Fmodificadorestatico.test;

import com.roadjava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 255);
        Carro carro3 = new Carro("Audi", 290);

        //Carro.velocidadeLimite = 180;
        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
