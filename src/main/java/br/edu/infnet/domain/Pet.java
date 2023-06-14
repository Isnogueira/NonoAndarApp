package br.edu.infnet.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;




@Entity
@Table
@Getter
@Setter
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nomePet;
	private String nomeDono;
    private int idade;
    private String tipo;
	private String sexo;
	private String dono;
    private String raca;
    private String pelagem;
	private int peso;
	private String dataCadastro;
	private String telDono;

    @ManyToOne
    @JoinColumn
    private Usuario usuario;
	@OneToMany
	@JoinColumn
    private List<Procedimento> procedimentos;

    public Pet() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		dataCadastro = LocalDateTime.now().format(formato);
    }

	public Pet(Integer id, String nomePet, String nomeDono, int idade, String tipo, String sexo,
			   String dono, String raca, String pelagem, int peso, String dataCadastro,
			   String telDono, Usuario usuario, List<Procedimento> procedimentos) {
		this.id = id;
		this.nomePet = nomePet;
		this.nomeDono = nomeDono;
		this.idade = idade;
		this.tipo = tipo;
		this.sexo = sexo;
		this.dono = dono;
		this.raca = raca;
		this.pelagem = pelagem;
		this.peso = peso;
		this.dataCadastro = dataCadastro;
		this.telDono = telDono;
		this.usuario = usuario;
		this.procedimentos = procedimentos;
	}

	//    @Override
//    public String toString() {
//
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
//
//        return String.format("%s;%s;%d;%d;R$%.2f;R$%.2f;%d;R$%.2f;%s;",
//                this.dataAnuncio.formatted(formato),
//                this.tipoAquisicao,
//                this.quartos,
//                this.banheiros,
//                this.valorVenda,
//                this.valorAluguel,
//                this.metrosQuadrados,
//                this.valorMetroQuadrado,
//                this.mobiliado ? "S" : "N");
//    }
    
    
}
