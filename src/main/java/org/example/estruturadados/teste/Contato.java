package org.example.estruturadados.teste;

import java.util.Objects;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato() {}

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato[" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome()) && Objects.equals(getTelefone(), contato.getTelefone()) && Objects.equals(getEmail(), contato.getEmail());
    }

}
