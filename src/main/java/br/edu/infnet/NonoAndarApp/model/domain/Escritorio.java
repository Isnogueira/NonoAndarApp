package br.edu.infnet.NonoAndarApp.model.domain;

import br.edu.infnet.NonoAndarApp.model.exceptions.AluguelNegativoOuZeradoException;
import br.edu.infnet.NonoAndarApp.model.exceptions.EmpresaConveniadaEmBrancoException;
/**
 *
 * @author IngridNogueira
 */
public class Escritorio extends Imovel {
    
    private String empresaConveniada;
    private boolean wifiIncluso;

    public Escritorio(String endereco, String cidade, String estado, String tipoAquisicao, int quartos, int banheiros, float valorVenda, float valorAluguel, int metrosQuadrados, float valorMetroQuadrado, boolean mobiliado) {
        super(endereco, cidade, estado, tipoAquisicao, quartos, banheiros, valorVenda, valorAluguel, metrosQuadrados, valorMetroQuadrado, mobiliado);
    }

        public String getEmpresaConveniada() {
        return empresaConveniada;
    }

    public void setEmpresaConveniada(String empresaConveniada) {
        this.empresaConveniada = empresaConveniada;
    }

    public boolean isWifiIncluso() {
        return wifiIncluso;
    }

    public void setWifiIncluso(boolean wifiIncluso) {
        this.wifiIncluso = wifiIncluso;
    }

    @Override
    public float calcularValorTotalAluguel() throws AluguelNegativoOuZeradoException, EmpresaConveniadaEmBrancoException{
        
         float valorAluguel = getValorAluguel();
        
        if (valorAluguel <= 0){
            throw new AluguelNegativoOuZeradoException("[Escritório] O valor do Aluguel informado está negativo ou zerado!");
        }
        
        if (this.empresaConveniada.isBlank()){
            throw new EmpresaConveniadaEmBrancoException ("[Escritório] A Empresa Conveniada não foi preenchida!");
        }
        
        boolean wifiIncluso = this.wifiIncluso;
        
        return wifiIncluso ? this.getValorAluguel() + 100 : this.getValorAluguel();
    }
    
 
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.empresaConveniada);
        sb.append(";");
        sb.append(this.wifiIncluso ? "S" : "N");
        sb.append(";");
        
        return sb.toString(); 
        
    }

    
}
