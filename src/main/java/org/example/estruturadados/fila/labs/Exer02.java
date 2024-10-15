package org.example.estruturadados.fila.labs;

import org.example.estruturadados.fila.Fila;
import org.example.estruturadados.fila.FilaComPrioridade;

public class Exer02 {
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfileira("Pessoa 1");
        regular.enfileira("Pessoa 2");
        regular.enfileira("Pessoa 3");
        prioridade.enfileira("Pessoa 1P");
        prioridade.enfileira("Pessoa 2P");
        prioridade.enfileira("Pessoa 3P");
        prioridade.enfileira("Pessoa 4P");
        prioridade.enfileira("Pessoa 5P");
        regular.enfileira("Pessoa 4");
        regular.enfileira("Pessoa 5");
        regular.enfileira("Pessoa 6");
        regular.enfileira("Pessoa 7");
        regular.enfileira("Pessoa 8");

        while (!regular.estaVazia() || !prioridade.estaVazia()){
            int cont = 0;
            while(!prioridade.estaVazia() && cont < MAX_PRIORIDADE){
                pessoaAtendida(prioridade);
                cont++;
            }
            if (!regular.estaVazia()){
                pessoaAtendida(regular);
            }
            if (prioridade.estaVazia()){
                while(!regular.estaVazia()){
                    pessoaAtendida(regular);
                }
            }
        }
    }
    public static void pessoaAtendida(Fila<String> fila){
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida);
    }
}
