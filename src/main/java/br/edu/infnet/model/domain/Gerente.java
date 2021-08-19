package br.edu.infnet.model.domain;

import javax.persistence.*;

@Entity
public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    public Gerente() {
    }

    public Gerente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Gerente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.email);
        sb.append(";");
        sb.append(this.telefone);
        sb.append(";");
        sb.append(this.senha);
        sb.append(";");
       
        return sb.toString();
    }

    
}
