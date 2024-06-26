package org.example.estruturadados.pilha.labs;

public class Livro{
    private String isbn;
    private String autor;
    private int anoLancamento;
    private String nome;

    public Livro(String isbn, String autor, int anoLancamento, String nome) {
        this.isbn = isbn;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.nome = nome;
    }
    public Livro(){

    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", nome='" + nome + '\'' +
                '}';
    }
}
