package org.example.estruturadados.teste;

import org.example.estruturadados.Vetor;

public class EstruturaDadosTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
        vetor.adiciona(0, "A");
        System.out.println(vetor);
        vetor.adiciona(2, "A");
        System.out.println(vetor);

//        System.out.println(vetor.tamanho());
//        System.out.println(vetor);
//        System.out.println(vetor.busca(1));
//        System.out.println(vetor.busca("elemento 1"));



    }
}
