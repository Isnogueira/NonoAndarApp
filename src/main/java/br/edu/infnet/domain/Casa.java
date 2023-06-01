package br.edu.infnet.domain;

import br.edu.infnet.domain.exceptions.AluguelNegativoOuZeradoException;
import br.edu.infnet.domain.exceptions.AndaresNegativoException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tCasa")
public class Casa extends Imovel {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    private boolean garagem;
    private boolean quintal;
    private int andares;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Casa() {
		
	}
    
    

	public Casa(boolean garagem, boolean quintal, int andares) {
		this.garagem = garagem;
		this.quintal = quintal;
		this.andares = andares;
	}

	public boolean isGaragem() {
        return garagem;
    }

    public void setGaragem(boolean garagem) {
        this.garagem = garagem;
    }

    public boolean isQuintal() {
        return quintal;
    }

    public void setQuintal(boolean quintal) {
        this.quintal = quintal;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        
        this.andares = andares;
    }

    @Override
    public float calcularValorTotalAluguel() throws AluguelNegativoOuZeradoException, AndaresNegativoException {

        float valorAluguel = getValorAluguel();
        
        if (valorAluguel <= 0){
            throw new AluguelNegativoOuZeradoException("[Casa] O valor do Aluguel informado está negativo ou zerado!");
        }
        
        if (this.andares < 0){
            throw new AndaresNegativoException("[Casa] O número de andares está negativo!");
        }
        
        if (this.andares > 1){
            
             valorAluguel += 500;
        }
        
        return valorAluguel;
    }
        
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(this.garagem ? "S" : "N");
        sb.append(";");
        sb.append(this.quintal ? "S" : "N");
        sb.append(";");
        sb.append(this.andares);
        sb.append(";");
        
        return sb.toString(); 
    }

}
