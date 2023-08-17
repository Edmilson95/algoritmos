package org.example.exercicios.iniciante;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int totalDias = ler.nextInt();

        int qntAnos = totalDias / 365;
        totalDias = totalDias % 365;

        int qntMeses = totalDias / 30;
        totalDias = totalDias % 30;

        int qntDias = totalDias;

        System.out.println(qntAnos + " ano(s)\n" + qntMeses + " mes(es)\n" + qntDias + " dia(s)\n");

    }
}
