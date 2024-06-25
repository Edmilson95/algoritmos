package org.example.estruturadados.pilha.teste;

import org.example.estruturadados.pilha.Pilha;

public class PilhaTeste2 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        Pilha<Integer> pilha2 = new Pilha<>();
        System.out.println(pilha2.estaVazia());
    }
}
