package org.example.estruturadados;

public class HelloWorld {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++){
            System.out.println(i);
        }
        long passou = (System.currentTimeMillis() - inicio) / 1000 ;

        System.out.println("Tempo de execução ai, André: " + passou + "s");



    }
}
