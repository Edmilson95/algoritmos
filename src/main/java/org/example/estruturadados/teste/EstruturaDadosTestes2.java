package org.example.estruturadados.teste;

import org.example.estruturadados.VetorObject;

public class EstruturaDadosTestes2 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);

        Contato c1 = new Contato("Contato 1", "1234567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "1235456", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "1235322", "contato3@email.com");
        Contato c4 = new Contato("Contato 3", "1235322", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);


        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4);
        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");

        }

        System.out.println(vetor);
    }
}
