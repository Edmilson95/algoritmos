package org.example.estruturadados.fila.labs;

import org.example.estruturadados.fila.Fila;
import org.example.estruturadados.fila.FilaComPrioridade;

public class Exer01 {
    public static void main(String[] args) {
        Fila<Document> fila = new Fila();
        fila.enfileira(new Document("Documento A", 1));
        fila.enfileira(new Document("Documento C", 3));
        fila.enfileira(new Document("Documento B", 2));

        while (!(fila.estaVazia())){
            Document doc = fila.desenfileira();
            System.out.println("Imprimindo documento: " + doc.getNome());
            try {
                Thread.sleep(200 * doc.getQuantidadeFolhas());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\nTodos documentos foram impressos. ");
    }


}
