package org.example.estruturadados.teste;

import org.example.estruturadados.Vetor;

public class EstruturaDadosTeste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        int posicao = vetor.busca("L");
        if (posicao > -1){
            vetor.remove(posicao);
            System.out.println(vetor);
        } else {
            System.out.println("Elemento não existe no vetor");
        }


//        vetor.remove(1);
//        vetor.adiciona(0, "A");
//        System.out.println(vetor);
//        System.out.println(vetor.tamanho());
//        System.out.println(vetor);
//        System.out.println(vetor.busca(1));
//        System.out.println(vetor.busca("elemento 1"));


    }
}
