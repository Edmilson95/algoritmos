package org.example.estruturadados.fila.teste;

import org.example.estruturadados.fila.Fila;
import org.example.estruturadados.fila.FilaComPrioridade;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaTeste2 {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(6);
        fila.enfileira(9);
        fila.enfileira(3);

        System.out.println(fila);

        Queue<Integer> filacomPrioridade = new PriorityQueue<>();
        filacomPrioridade.add(2);
        filacomPrioridade.add(1);
        System.out.println(filacomPrioridade);

    }
}
