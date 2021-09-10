package br.edu.infnet.model.domain;

import br.edu.infnet.model.domain.exceptions.AluguelNegativoOuZeradoException;
import br.edu.infnet.model.domain.exceptions.AndaresNegativoException;
import br.edu.infnet.model.domain.exceptions.VagasNegativaException;
import br.edu.infnet.model.domain.exceptions.CondominioNegativoOuZeradoException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "tImovel")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String dataAnuncio;
    @Transient
    private String tipoAquisicao;
    @Transient
    private int quartos;
    @Transient
    private int banheiros;
    private float valorVenda;
    private float valorAluguel;
    private int metrosQuadrados;
    @Transient
    private float valorMetroQuadrado;
    @Transient
    private boolean mobiliado;

    public Imovel() {
    	
    	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        dataAnuncio = LocalDateTime.now().format(formato);
    }

    public Imovel(String endereco, String cidade) {
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        
    }

    public Imovel(Integer id,String dataAnuncio,
			String tipoAquisicao, int quartos, int banheiros, float valorVenda, float valorAluguel, int metrosQuadrados,
			float valorMetroQuadrado, boolean mobiliado) {
		this.id = id;
		this.dataAnuncio = dataAnuncio;
		this.tipoAquisicao = tipoAquisicao;
		this.quartos = quartos;
		this.banheiros = banheiros;
		this.valorVenda = valorVenda;
		this.valorAluguel = valorAluguel;
		this.metrosQuadrados = metrosQuadrados;
		this.valorMetroQuadrado = valorMetroQuadrado;
		this.mobiliado = mobiliado;
	}

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getDataAnuncio() {
		return dataAnuncio;
	}

	public void setDataAnuncio(String dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}

	public String getTipoAquisicao() {
		return tipoAquisicao;
	}

	public void setTipoAquisicao(String tipoAquisicao) {
		this.tipoAquisicao = tipoAquisicao;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	public int getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(int banheiros) {
		this.banheiros = banheiros;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public int getMetrosQuadrados() {
		return metrosQuadrados;
	}

	public void setMetrosQuadrados(int metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}

	public float getValorMetroQuadrado() {
		return valorMetroQuadrado;
	}

	public void setValorMetroQuadrado(float valorMetroQuadrado) {
		this.valorMetroQuadrado = valorMetroQuadrado;
	}

	public boolean isMobiliado() {
		return mobiliado;
	}

	public void setMobiliado(boolean mobiliado) {
		this.mobiliado = mobiliado;
	}

	public abstract float calcularValorTotalAluguel() throws CondominioNegativoOuZeradoException, VagasNegativaException,
            AluguelNegativoOuZeradoException, AndaresNegativoException;
    
    public String ObterImovel() throws CondominioNegativoOuZeradoException, VagasNegativaException,
            AluguelNegativoOuZeradoException, AndaresNegativoException{
        
        StringBuilder sb = new StringBuilder();

        sb.append(this.toString());
        sb.append(this.calcularValorTotalAluguel());
        
        return sb.toString();
    }
    
    @Override
    public String toString() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        
        return String.format("%s;%s;%d;%d;R$%.2f;R$%.2f;%d;R$%.2f;%s;",
                this.dataAnuncio.formatted(formato),
                this.tipoAquisicao,
                this.quartos,
                this.banheiros,
                this.valorVenda,
                this.valorAluguel,
                this.metrosQuadrados,
                this.valorMetroQuadrado,
                this.mobiliado ? "S" : "N");
    }
    
    
}
