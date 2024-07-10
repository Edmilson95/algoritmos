package org.example.estruturadados.fila.teste;

import org.example.estruturadados.fila.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaTeste {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        Queue<Integer> fila2 = new LinkedList<>();

        fila.enfileira(1);
        fila.enfileira(2);
        System.out.println(fila);
        fila.desenfileira();
        System.out.println(fila);
        System.out.println(fila.espiar());

        fila2.add(5);
        fila2.add(6);
        System.out.println(fila2);
        System.out.println(fila2.peek());
        System.out.println(fila2.remove());
        System.out.println(fila2);

    }
}
