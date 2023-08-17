package org.example.exercicios.iniciante;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int totalSegundos = ler.nextInt();

        int qntHoras = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;

        int qntMinutos = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;

        int qntSegundos = totalSegundos;

        System.out.println(qntHoras + ":" + qntMinutos + ":" + qntSegundos);

        ler.close();
    }



}
