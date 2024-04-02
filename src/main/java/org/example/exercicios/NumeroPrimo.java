package org.example.exercicios;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Escreva um número inteiro e positivo para verificar se é primo: ");
        int numberUser = read.nextInt();

        if (numberUser <= 0){
            System.out.println("Digite um número inteiro positivo.");
            read.close();
        }

        if (numberUser > 0 ) {
            System.out.println("*-".repeat(30));

            boolean ehPrimo = true;

            if (numberUser <= 1) {
                ehPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numberUser); i++) {
                    if (numberUser % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                System.out.println(numberUser + " é um número primo");
            } else {
                System.out.println(numberUser + " não é um número primo");
            }

        }
        read.close();
    }
}
