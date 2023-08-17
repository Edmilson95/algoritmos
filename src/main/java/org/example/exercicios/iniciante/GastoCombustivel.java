package org.example.exercicios.iniciante;

import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int horas = ler.nextInt();
        int velocidade = ler.nextInt();

        double distancia = horas * velocidade;

        double gasolina = distancia / 12;

        System.out.println(String.format("%.3f", gasolina));
    }
}
