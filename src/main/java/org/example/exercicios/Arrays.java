package org.example.exercicios;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numAlunos = 5;
        double[] notaAlunos = new double[5];

        for (int i = 0; i < numAlunos; i++){
            System.out.println("Insira a nota do " + (i+1) + "º aluno: ");
            notaAlunos[i] = input.nextDouble();
        }

        for (int i = 0; i < notaAlunos.length; i++){
            System.out.println("->" + notaAlunos[i]);
        }
    }
}

class Arrays2 {
    public static void main(String[] args) {
        int i;
        int[] x = new int[10];

        //    prefira usar .length que puxa o tamanho do array
        for (i = 0; i < x.length; ++i) {
            //System.out.println(x[i]);
        }
        //inves de usar isso(para preencher todos elementos com o numero 50 ->
        for (i = 0; i < x.length; ++i) {
            x[i] = 50;
        }
        //existe o metodo da classe java.util
        java.util.Arrays.fill(x, 50);
        java.util.Arrays.fill(x, 2, 5, 3);

        for (i = 0; i < x.length; ++i) {
            System.out.println(x[i]);
        }
    }
}
