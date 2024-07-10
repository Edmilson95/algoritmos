package org.example.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T>{

    public void enfileira(T elemento){

        //obj1 > obj2 retorna > 0 (1)
        //obj1 < obj2 retorna < 0 (-1)

        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < this.tamanho; i++){
            if (chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        adiciona(i, elemento);
    }
}
