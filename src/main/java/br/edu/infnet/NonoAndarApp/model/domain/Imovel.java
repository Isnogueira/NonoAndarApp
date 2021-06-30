package br.edu.infnet.NonoAndarApp.model.domain;

import br.edu.infnet.NonoAndarApp.model.exceptions.AluguelNegativoOuZeradoException;
import br.edu.infnet.NonoAndarApp.model.exceptions.AndaresNegativoException;
import br.edu.infnet.NonoAndarApp.model.exceptions.CondominioNegativoOuZeradoException;
import br.edu.infnet.NonoAndarApp.model.exceptions.EmpresaConveniadaEmBrancoException;
import br.edu.infnet.NonoAndarApp.model.exceptions.VagasNegativaException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author IngridNogueira
 */
public abstract class Imovel {
    
    private String endereco;
    private String cidade;
    private String estado;
    private LocalDateTime dataAnuncio;
    private String tipoAquisicao;
    private int quartos;
    private int banheiros;
    private float valorVenda;
    private float valorAluguel;
    private int metrosQuadrados;
    private float valorMetroQuadrado;
    private boolean mobiliado;

    public Imovel() {
        
        dataAnuncio = LocalDateTime.now();
    }
    
    public Imovel(String endereco, String cidade, String estado, String tipoAquisicao, int quartos, int banheiros, float valorVenda, float valorAluguel, int metrosQuadrados, float valorMetroQuadrado, boolean mobiliado) {
        this();
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.tipoAquisicao = tipoAquisicao;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        this.metrosQuadrados = metrosQuadrados;
        this.valorMetroQuadrado = valorMetroQuadrado;
        this.mobiliado = mobiliado;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getDataAnuncio() {
        return dataAnuncio;
    }
    
    public String getTipoAquisicao() {
        return tipoAquisicao;
    }

    public int getQuartos() {
        return quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public float getValorVenda() {
        
        return valorVenda;
    }

    public float getValorAluguel() {
        
        return valorAluguel;
    }

    public int getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public float getValorMetroQuadrado() {
        
        return valorMetroQuadrado;
    }

    public boolean isMobiliado() {
        return mobiliado;
    }
    
    public abstract float calcularValorTotalAluguel() throws CondominioNegativoOuZeradoException, VagasNegativaException, AluguelNegativoOuZeradoException, 
            EmpresaConveniadaEmBrancoException, AndaresNegativoException;
    
    public String ObterImovel() throws CondominioNegativoOuZeradoException, VagasNegativaException, AluguelNegativoOuZeradoException, 
            EmpresaConveniadaEmBrancoException, AndaresNegativoException{
        
        StringBuilder sb = new StringBuilder();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        sb.append(this.endereco);
        sb.append(";");
        sb.append(this.cidade);
        sb.append(";");
        sb.append(this.estado);
        sb.append(";");
        sb.append(this.dataAnuncio.format(formato));
        sb.append(";");
        sb.append(this.tipoAquisicao);
        sb.append(";");
        sb.append(this.quartos);
        sb.append(";");
        sb.append(this.banheiros);
        sb.append(";");
        sb.append(this.valorVenda);
        sb.append(";");
        sb.append(this.valorAluguel);
        sb.append(";");
        sb.append(this.metrosQuadrados);
        sb.append(";");
        sb.append(this.valorMetroQuadrado);
        sb.append(";");
        sb.append(this.mobiliado);
        sb.append(";");
        sb.append(this.calcularValorTotalAluguel());
        
        return sb.toString();
    }
    
    @Override
    public String toString() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        
        return String.format("%s;%s;%s;%s;%s;%d;%d;R$%.2f;R$%.2f;%d;R$%.2f;%s;",
                this.endereco,
                this.cidade,
                this.estado,
                this.dataAnuncio.format(formato),
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
