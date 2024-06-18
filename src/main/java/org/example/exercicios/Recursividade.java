package org.example.exercicios;

public class Recursividade {
    //Método que chama ele mesmo
    //Precisa de um ponto de parada

    public static int fatorialNaoRecursivo(int num){
        if (num == 0){
            return 1;
        }
        int total = 1;
        for (int i=num; i > 1; i--){
            total *= i;
        }
        return total;
    }

    //fatorial(5) = 5 * fatorial(4)
    //fatorial(4) = 4 * fatorial(3)
    //fatorial(3) = 3 * fatorial(2)
    //fatorial(2) = 2 * fatorial(1)
    //fatorial(1) = 1 * fatorial(0)
    //fatorial(0) = 1;
    public static int fatorial(int num){
        if (num == 0){
            return 1;
        }
        return num * fatorial(num - 1);
    }

    public static void main(String[] args) {

        int fatorialNaoRecursivo = Recursividade.fatorialNaoRecursivo(5);
        System.out.println(fatorialNaoRecursivo);

        int fatorialRecursivo = Recursividade.fatorial(5);
        System.out.println(fatorialRecursivo);

    }
}

//exercicios aula 36