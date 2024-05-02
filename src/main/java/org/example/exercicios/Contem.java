package org.example.exercicios;

import org.example.estruturadados.Lista;

public class Contem {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(3);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("F"));

    }
}
