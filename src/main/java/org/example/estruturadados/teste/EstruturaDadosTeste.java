package org.example.estruturadados.teste;

import org.example.estruturadados.Vetor;

public class EstruturaDadosTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);
        System.out.println(vetor.busca(1));



    }
}
