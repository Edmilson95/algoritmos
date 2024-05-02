package org.example.estruturadados.teste;

import java.util.ArrayList;

public class EstruturaDados4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        if (existe){
            System.out.println("Existe no array");
        } else{
            System.out.println("Não existe no array");

        }
    }
}
