package org.example.estruturadados.teste;

import org.example.estruturadados.Lista;
import org.example.estruturadados.VetorObject;

public class EstruturaDadosTestes3 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Ed", "12344", "edmilson@mail.com");

        //vetor.adiciona("Elemento");
        vetor.adiciona(c1);

    }
}
