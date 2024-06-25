package org.example.estruturadados.pilha.teste;

import org.example.estruturadados.pilha.Pilha;

public class PilhaTeste2 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }
        // System.out.println(pilha);
       // System.out.println(pilha.tamanho());

        Pilha<Integer> pilha2 = new Pilha<>();

//        System.out.println(pilha2.topo());
//        System.out.println(pilha2);
//        pilha2.empilha(1);
//        pilha2.empilha(2543);

//        System.out.println(pilha2.topo());
//        System.out.println(pilha2);

        Pilha<Integer> pilha3 = new Pilha<>();
        pilha3.empilha(1);
        pilha3.empilha(2);
        pilha3.empilha(3);
        System.out.println(pilha3);
        System.out.println("Desempilhando o: " + pilha3.desempilha());
        System.out.println(pilha3);

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        Pilha<Integer> pilha4 = new Pilha<>();
        System.out.println(pilha2.estaVazia());
    }
}
