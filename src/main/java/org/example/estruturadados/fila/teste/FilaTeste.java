package org.example.estruturadados.fila.teste;

import org.example.estruturadados.fila.Fila;

public class FilaTeste {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        System.out.println(fila);
        fila.desenfileira();
        System.out.println(fila);

    }
}
