package org.example.estruturadados.fila.labs;

import org.example.estruturadados.fila.FilaComPrioridade;

public class PSAtendimento implements Runnable{
    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }
    @Override
    public void run() {
        while (!fila.estaVazia()){
            try {
                Thread.sleep(5000);
                System.out.println(fila.desenfileira() + " atendida.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Atendimento concluído.");
    }
}
