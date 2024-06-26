package org.example.estruturadados.pilha.labs;

import org.example.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();


        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Entre com um número: ");
            int num = scan.nextInt();

            if (num == 0) {
                //pilha par
                Integer desempilhado = par.desempilha();
                if (desempilhado == null){
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desemepilhando da pilha par: " + desempilhado);
                }

                //pilha impar
                desempilhado = impar.desempilha();
                if (desempilhado == null){
                    System.out.println("Pilha ímpar vazia");
                } else {
                    System.out.println("Desemepilhando da pilha ímpar: " + desempilhado);
                }
            } else if (num % 2 == 0) {
                System.out.println("Empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Empilhando na pilha ímpar: " + num);
                impar.empilha(num);
            }
        }

        System.out.println("Todos números foram lidos. Desempilhando pilha par....");

        while (!par.estaVazia()) {
            System.out.println("Desempilhando da pilhar par: " + par.desempilha());
        }
        while (!impar.estaVazia()) {
            System.out.println("Desempilhando da pilhar impar: " + impar.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");

    }
}

