package org.example.exercicios;

import org.example.estruturadados.Lista;

public class UltimoIndice {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(3);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        int index = lista.ultimoIndice("A");
        System.out.println("Ultimo indice da Lista: " + index);

    }
}
