package org.example.estruturadados.fila.labs;

public class Document {
    private String nome;
    private int quantidadeFolhas;

    public Document(String nome, int quantidadeFolhas) {
        this.nome = nome;
        this.quantidadeFolhas = quantidadeFolhas;
    }

    public Document() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    public void setQuantidadeFolhas(int quantidadeFolhas) {
        this.quantidadeFolhas = quantidadeFolhas;
    }

    @Override
    public String toString() {
        return "Document{" +
                "nome='" + nome + '\'' +
                ", quantidadeFolhas=" + quantidadeFolhas +
                '}';
    }
}

