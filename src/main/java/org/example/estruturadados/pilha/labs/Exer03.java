package org.example.estruturadados.pilha.labs;

import org.example.estruturadados.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

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

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);

        System.out.println("6 livros foram empilhados: ");
        System.out.println(pilha.tamanho() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
        System.out.println("Espiando o topo de livros da pilha" + pilha.topo());

        System.out.println("Desempilhando livros da pilha: ");

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
    }

}
