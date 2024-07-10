package org.example.estruturadados.fila.teste;

import org.example.estruturadados.fila.Fila;
import org.example.estruturadados.fila.FilaComPrioridade;

import java.util.LinkedList;
import java.util.Queue;

public class FilaTeste2 {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(6);
        fila.enfileira(9);
        fila.enfileira(3);
        fila.enfileira(11);
        fila.enfileira(4);
        fila.enfileira(10);
        fila.enfileira(2);
        fila.enfileira(5);
        fila.enfileira(7);
        fila.enfileira(8);

        System.out.println(fila);

    }
}
