package br.edu.infnet.model.domain;

import br.edu.infnet.model.domain.exceptions.AluguelNegativoOuZeradoException;
import br.edu.infnet.model.domain.exceptions.AndaresNegativoException;

public class Casa extends Imovel {
    
    private boolean garagem;
    private boolean quintal;
    private int andares;

    public Casa(String endereco, String cidade, String estado, String tipoAquisicao, int quartos, int banheiros, float valorVenda, float valorAluguel, int metrosQuadrados, float valorMetroQuadrado, boolean mobiliado) {
        super(endereco, cidade, estado, tipoAquisicao, quartos, banheiros, valorVenda, valorAluguel, metrosQuadrados, valorMetroQuadrado, mobiliado);
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
