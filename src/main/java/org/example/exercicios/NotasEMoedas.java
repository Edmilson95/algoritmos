package org.example.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US); // Define o uso do ponto como separador decimal

        double valor = ler.nextDouble();

        System.out.println(valor);

        if (valor < 0 ){
           String.format("%.2f");
        }
        System.out.println("NOTAS:");
        System.out.println(valor / 100 + " nota(s) de R$ 100,00");
        valor = valor % 100;
        System.out.println(valor / 50 + " nota(s) de R$ 50,00");
        valor = valor % 50;
        System.out.println(valor / 20 + " nota(s) de R$ 20,00");
        valor = valor % 20;
        System.out.println(valor / 10 +" nota(s) de R$ 10,00");
        valor = valor % 10;
        System.out.println(valor / 5 + " nota(s) de R$ 5,00");
        valor = valor % 5;
        System.out.println(valor / 2 + " nota(s) de R$ 2,00");
        valor = valor % 2;

        System.out.println("MOEDAS:");
        System.out.println(valor / 1 + "%.1f moeda(s) de R$ 1,00");
        valor = valor % 1;
        System.out.println(valor / 0.50 + "%.1f moeda(s) de R$ 0,50");
        valor = valor % 0.50;
        System.out.println(valor / 0.25 + "%.1f moeda(s) de R$ 0.25");
        valor = valor % 0.25;
        System.out.println(valor / 0.10 + "%.1f moeda(s) de R$ 0.10");
        valor = valor % 0.10;
        System.out.println(valor / 0.05 + "%.1f moeda(s) de R$ 0.05");
        valor = valor % 0.05;
        System.out.printf("%.1d moeda(s) de R$ 0.01", valor / 0.01);

        

        ler.close();

    }
}
