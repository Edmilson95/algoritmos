package org.example.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {
    public static void main(String[] args) {
        imprimeResultado(250);
    }

    public static void imprimeResultado(int decimal){
        System.out.println(decimal + " em binário é: "
                + converteBinario(decimal));
    }
    public static String converteBinario(int decimal){
        Stack<Integer> pilha = new Stack<>();
        String binario = "";
        int resto;
        if (decimal == 0){
            return "0";
        }
        while (decimal > 0){
            resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }
        while (!pilha.isEmpty()){
            binario += pilha.pop();
        }
        return binario;
    }
}
