package org.example.exercicios;

import org.example.estruturadados.Lista;

import java.util.ArrayList;

public class MetodoObtem {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(3);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.obtem(2));


    }
}
