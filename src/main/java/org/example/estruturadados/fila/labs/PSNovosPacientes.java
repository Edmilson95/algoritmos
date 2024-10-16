package org.example.estruturadados.fila.labs;

import org.example.estruturadados.fila.FilaComPrioridade;

public class PSNovosPacientes implements Runnable{
    private FilaComPrioridade<Pessoa> fila;

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

    }
}
