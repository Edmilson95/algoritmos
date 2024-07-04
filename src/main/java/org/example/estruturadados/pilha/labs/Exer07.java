package org.example.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {
    public static void main(String[] args) {
        imprimeResultado(255, 16);
    }

    public static void imprimeResultado(int numero, int base){
        System.out.println(numero + " na base "
                + base + " é: "
                + converteQlqrBase(numero, base));
    }
    public static String converteQlqrBase(int numero, int base){
        Stack<Integer> pilha = new Stack<>();
        String numBase = "";
        String bases = "0123456789ABCDEF";
        int resto;

        if (numero == 0){
            return "0";
        }
        while (numero > 0){
            resto = numero % base;
            pilha.push(resto);
            numero = numero / base;
        }
        while (!pilha.isEmpty()){
            numBase += bases.charAt(pilha.pop());
        }
        return numBase;
    }
}
