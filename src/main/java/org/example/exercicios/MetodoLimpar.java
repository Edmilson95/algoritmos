package org.example.exercicios;

import org.example.estruturadados.Lista;

public class MetodoLimpar {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(3);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);
    }
}
