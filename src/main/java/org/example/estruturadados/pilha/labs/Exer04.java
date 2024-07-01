package org.example.estruturadados.pilha.labs;

import org.example.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Conquistando o java");
        livro1.setAutor("Edmilson Ferreira");
        livro1.setIsbn("12345");
        livro1.setAnoLancamento(2023);

        Livro livro2 = new Livro();
        livro2.setNome("Java");
        livro2.setAutor("Edmilson Ferreira");
        livro2.setIsbn("12345");
        livro2.setAnoLancamento(2023);

        Livro livro3 = new Livro();
        livro3.setNome("Estruturas");
        livro3.setAutor("Edmilson Ferreira");
        livro3.setIsbn("12345");
        livro3.setAnoLancamento(2023);

        Livro livro4 = new Livro();
        livro4.setNome("Exercicios");
        livro4.setAutor("Edmilson Ferreira");
        livro4.setIsbn("12345");
        livro4.setAnoLancamento(2023);

        Livro livro5 = new Livro();
        livro5.setNome("Loucura no caldeirao");
        livro5.setAutor("Edmilson Ferreira");
        livro5.setIsbn("12345");
        livro5.setAnoLancamento(2023);

        Livro livro6 = new Livro();
        livro6.setNome("Desenvolvendo");
        livro6.setAutor("Edmilson Ferreira");
        livro6.setIsbn("12345");
        livro6.setAnoLancamento(2023);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.empty());

        System.out.println("Empilhando livros na pilha");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        System.out.println("6 livros foram empilhados: ");
        System.out.println(pilha.size() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.empty());
        System.out.println("Espiando o topo de livros da pilha" + pilha.peek());

        System.out.println("Desempilhando livros da pilha: ");

        while (!pilha.empty()){
            System.out.println("Desempilhando livro: " + pilha.pop());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.empty());
    }
}
