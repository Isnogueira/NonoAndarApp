package br.edu.infnet.domain;

import br.edu.infnet.domain.exceptions.CondominioNegativoOuZeradoException;
import br.edu.infnet.domain.exceptions.VagasNegativaException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tApartamento")
public class Apartamento extends Imovel {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private float valorCondominio;
    private boolean suite;
    private int vagas;
    private boolean petFriendly;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Apartamento() {
    }
    
    
    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio){
        
        this.valorCondominio = valorCondominio;
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
        
        if (this.valorCondominio <= 0){
            throw new CondominioNegativoOuZeradoException("[Apartamento] Valor de aluguel informado está Negativo ou Zerado!");
        } 
        
        if (this.vagas < 0){
            throw new VagasNegativaException("[Apartamento] O número de vagas está negativo!");
        }
        
        return this.getValorAluguel() + this.valorCondominio + this.vagas * 30;
    }
   
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.valorCondominio);
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