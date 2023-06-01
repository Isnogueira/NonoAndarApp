package br.edu.infnet.domain;

import br.edu.infnet.domain.exceptions.CondominioNegativoOuZeradoException;
import br.edu.infnet.domain.exceptions.AluguelNegativoOuZeradoException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tEscritorio")
public class Escritorio extends Imovel {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private float condominio;
    private boolean wifiIncluso;
    private boolean portaria24hrs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Escritorio() {
	
	}
    
	public Escritorio(float condominio, boolean wifiIncluso, boolean portaria24hrs) {
	
		this.condominio = condominio;
		this.wifiIncluso = wifiIncluso;
		this.portaria24hrs = portaria24hrs;
	}


	public float getCondominio() {
        return condominio;
    }

    public void setCondominio(float condominio) {
        this.condominio = condominio;
    }

 
    public boolean isWifiIncluso() {
        return wifiIncluso;
    }

    public void setWifiIncluso(boolean wifiIncluso) {
        this.wifiIncluso = wifiIncluso;
    }

    public boolean isPortaria24hrs() {
        return portaria24hrs;
    }

    public void setPortaria24hrs(boolean portaria24hrs) {
        this.portaria24hrs = portaria24hrs;
    }
    
    @Override
    public float calcularValorTotalAluguel() throws AluguelNegativoOuZeradoException, CondominioNegativoOuZeradoException, CondominioNegativoOuZeradoException{
        
         float valorAluguel = getValorAluguel();
        
        if (valorAluguel <= 0){
            throw new AluguelNegativoOuZeradoException("[Escritório] O valor do Aluguel informado está negativo ou zerado!");
        }
        
        if (this.condominio <= 0){
            throw new CondominioNegativoOuZeradoException("[Escritório] O valor do condominio informado está negativo ou zerado!");
        }
        
        if (this.portaria24hrs){
       
            float acrescimoPortaria24hrs = this.condominio *= 0.10;
            this.condominio += acrescimoPortaria24hrs;
        }
        
         if (this.wifiIncluso){
            
            float acrescimoWifi = this.condominio *= 0.05;
            this.condominio += acrescimoWifi;
        }
        
        return this.getValorAluguel() + this.condominio;
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(this.condominio);
        sb.append(";");
        sb.append(this.wifiIncluso ? "S" : "N");
        sb.append(";");
        sb.append(this.portaria24hrs ? "S" : "N");
        sb.append(";");
        
        return sb.toString(); 
        
    }


}
