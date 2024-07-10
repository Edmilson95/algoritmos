package org.example.estruturadados.fila;

import org.example.estruturadados.base.EstruturaEstatica;

import java.util.*;

//FIFO - FIRST IN, FIRST OUT
public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(){
        super();
    }
    public Fila(int capacidade){
        super(capacidade);
    }

    public Object espiar(){
        if (this.estaVazia()){
            return null;
        }
        return this.elementos[0];
    }
    public void enfileira(T elemento){
//        this.elementos[this.tamanho] = elemento;
//        this.tamanho++;

//        this.elementos[this.tamanho++] = elemento;

        this.adiciona(elemento);
    }

    public T desenfileira(){
        if (this.estaVazia()){
            return null;
        }
        T elementoRemovido = elementos[0];
        elementos[0] = null; // limpa o elemento da frente
        for (int i = 0; i < tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return elementoRemovido;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

}
