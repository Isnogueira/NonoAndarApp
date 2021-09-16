package br.edu.infnet.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Imobiliaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nome;
    private String telefone;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idGerente")
    private Gerente gerente;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Imovel> imoveis;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    
    public Imobiliaria() {

	}


	public Imobiliaria(Integer id, String nome, String telefone, Gerente gerente,
			List<Imovel> imoveis, Usuario usuario) {
	
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.gerente = gerente;
		this.imoveis = imoveis;
		this.usuario = usuario;
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


	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.telefone);
        sb.append(";");
        sb.append(this.gerente);
        
        return sb.toString();
    }
    
    
}
