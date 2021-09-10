package br.edu.infnet.model.domain;

import br.edu.infnet.model.domain.exceptions.VagasNegativaException;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.model.domain.exceptions.CondominioNegativoOuZeradoException;

@Entity
@Table(name = "tApartamento")
public class Apartamento extends Imovel {
    
    private float valorCondomínio;
    private boolean suite;
    private int vagas;
    private boolean petFriendly;

    public Apartamento() {
    }
    
    
    public float getValorCondomínio() {
        return valorCondomínio;
    }

    public void setValorCondomínio(float valorCondomínio){
        
        this.valorCondomínio = valorCondomínio;
    }

    public boolean isSuite() {
        
        return suite;
    }

    public void setSuite(boolean suite) {
        
        this.suite = suite;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    @Override
    public float calcularValorTotalAluguel() throws CondominioNegativoOuZeradoException, VagasNegativaException {
        
        if (this.valorCondomínio <= 0){
            throw new CondominioNegativoOuZeradoException("[Apartamento] Valor de aluguel informado está Negativo ou Zerado!");
        } 
        
        if (this.vagas < 0){
            throw new VagasNegativaException("[Apartamento] O número de vagas está negativo!");
        }
        
        return this.getValorAluguel() + this.valorCondomínio + this.vagas * 30;
    }
   
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.valorCondomínio);
        sb.append(";");
        sb.append(this.suite ? "S" : "N");
        sb.append(";");
        sb.append(this.vagas);
        sb.append(";");
        sb.append(this.petFriendly ? "S" : "N");
        sb.append(";");
        
        return sb.toString();
    }
    
}