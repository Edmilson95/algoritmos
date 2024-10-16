package org.example.estruturadados.fila.labs;

import org.example.estruturadados.fila.FilaComPrioridade;

public class Exer03 {
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<Pessoa>();
        fila.enfileira(new Pessoa("Edmilson", VERDE));
        fila.enfileira(new Pessoa("Natalia", AMARELO));
        fila.enfileira(new Pessoa("Roberson", VERMELHO));
        fila.enfileira(new Pessoa("Gerivaldo", VERDE));
        fila.enfileira(new Pessoa("Valdivia", VERDE));
        fila.enfileira(new Pessoa("Pelé", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);

        Thread t1 = new Thread(atendimento);

        t1.start();

    }
}
