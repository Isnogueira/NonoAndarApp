package br.edu.infnet.model.domain;

public class Imobiliaria {
    
    private String nome;
    private String endereço;
    private String telefone;
    private Gerente gerente;

    public Imobiliaria(String nome, String endereço, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) { this.gerente = gerente;}

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.endereço);
        sb.append(";");
        sb.append(this.telefone);
        sb.append(";");
        sb.append(this.gerente);
        
        return sb.toString();
    }
    
    
}
