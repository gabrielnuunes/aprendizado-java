package com.roadjava.javacore.Gassociacao.test;

import com.roadjava.javacore.Gassociacao.domain.Escola;
import com.roadjava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Kohana", professores);

        escola.imprime();
    }
}
