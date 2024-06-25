package org.example.estruturadados.pilha.teste;

import java.util.Stack;

public class StackApi {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());

        stack.push(1); // empilhar
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty()); // estaVazio
        System.out.println(stack.size()); //tamanho
        System.out.println(stack); //toString

        System.out.println(stack.peek()); //espiar

        System.out.println(stack.pop()); //desempilhar

        System.out.println(stack);
    }


}
