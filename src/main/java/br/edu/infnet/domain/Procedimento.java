package br.edu.infnet.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
public class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nomePet;
    private String tipo;
    private String data;
    private String hora;
    private String observacao;
    private String laudo;

    @ManyToOne
    @JoinColumn
    private Pet pet;
    @ManyToOne
    @JoinColumn
    private Usuario usuario;
    
    public Procedimento() {
	}

    public Procedimento(Integer id, String tipo, String data, String hora, String observacao,
                        String laudo, Pet pet, Usuario usuario) {
        this.id = id;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
        this.laudo = laudo;
        this.pet = pet;
        this.usuario = usuario;
    }

    //	@Override
//    public String toString() {
//
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(this.nome);
//        sb.append(";");
//        sb.append(this.telefone);
//        sb.append(";");
//        sb.append(this.gerente);
//
//        return sb.toString();
//    }
//
    
}
