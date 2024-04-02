package org.example.exercicios;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua 1ª nota: ");
        double nota1 = ler.nextDouble();

        System.out.println("Digite sua 2ª nota: ");
        double nota2 = ler.nextDouble();

        System.out.println("Digite sua 3ª nota: ");
        double nota3 = ler.nextDouble();

        double mediaNotas = (nota1 + nota2 + nota3) / 3;

        String mediaFormatada = String.format("%.2f", mediaNotas);

        System.out.println("A média de suas notas é: " + mediaFormatada);

        ler.close();
    }

}
