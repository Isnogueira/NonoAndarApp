package br.edu.infnet.NonoAndarApp.model.domain.tests;

import br.edu.infnet.NonoAndarApp.model.domain.Gerente;
import br.edu.infnet.NonoAndarApp.model.domain.Imobiliaria;

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
