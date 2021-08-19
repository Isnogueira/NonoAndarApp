package br.edu.infnet.domain.model.tests;

import br.edu.infnet.domain.model.Gerente;
import br.edu.infnet.domain.model.Imobiliaria;

/**
 *
 * @author IngridNogueira
 */
public class ImobiliariaTest {
    
    public static void main(String[] args) {
        
        Gerente gerente1 = new  Gerente("Ingrid", "@@@", "1245");
        
        Imobiliaria imobiliaria1 = new Imobiliaria("Intra Imoveis", "Av Nossa senhora de Fátima, 102 - Curralzinho - RN", "45667-2345");
        imobiliaria1.setGerente(gerente1);
        System.out.println("Imobiliaria: " + imobiliaria1);
    }
}
