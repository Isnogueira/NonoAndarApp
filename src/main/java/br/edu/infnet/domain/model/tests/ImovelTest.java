package br.edu.infnet.domain.model.tests;

import br.edu.infnet.domain.model.Apartamento;
import br.edu.infnet.domain.model.Casa;
import br.edu.infnet.domain.model.Escritorio;
import br.edu.infnet.domain.model.exceptions.AluguelNegativoOuZeradoException;
import br.edu.infnet.domain.model.exceptions.AndaresNegativoException;
import br.edu.infnet.domain.model.exceptions.VagasNegativaException;
import br.edu.infnet.domain.model.exceptions.CondominioNegativoOuZeradoException;


/**
 *
 * @author IngridNogueira
 */
public class ImovelTest {
    
    public static void main(String[] args){
        
        try {
            Apartamento apt1 = new Apartamento("Rua Paulo Gustavo 34/301", "Niteroi", "Rio de Janeiro", "Aluguel", 2, 2, 1390000, 2900, 100, 100, true);
            apt1.setValorCondomínio(900);
            apt1.setSuite(false);
            apt1.setVagas(1);
            apt1.setPetFriendly(true);
            System.out.println("Apartamento: " + apt1.ObterImovel());
           
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
                    System.out.println(ex.getMessage());
        }
        try {
            Apartamento apt2 = new Apartamento("Rua Paulo Gustavo 34/301", "Niteroi", "Rio de Janeiro", "Aluguel", 2, 2, 1390000, 2900, 100, 100, true);
            apt2.setValorCondomínio(800);
            apt2.setSuite(false);
            apt2.setVagas(1);
            apt2.setPetFriendly(true);
            System.out.println("Apartamento: " + apt2.ObterImovel());
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
            System.out.println(ex.getMessage());
        }
            
        try {
            Apartamento apt3 = new Apartamento("Rua Paulo Gustavo 34/301", "Niteroi", "Rio de Janeiro", "Aluguel", 2, 2, 1390000, 2900, 100, 100, true);
            apt3.setValorCondomínio(900);
            apt3.setSuite(false);
            apt3.setVagas(-1);
            apt3.setPetFriendly(true);
            System.out.println("Apartamento: " + apt3.ObterImovel());
       
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
            System.out.println(ex.getMessage());
        }
            
        try {
            Casa casa1 = new Casa("Rua Alvaro Ramos 67/705", "Rio de Janeiro", "Rio de Janeiro", "Venda", 2, 2, 1390000, 2900, 100, 100, true);
            casa1.setGaragem(true);
            casa1.setQuintal(false);
            casa1.setAndares(1);
            System.out.println("Casa: " + casa1.ObterImovel());
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
            System.out.println(ex.getMessage());
        }
            
        try {
            Casa casa2 = new Casa("Rua Alvaro Ramos 67/705", "Rio de Janeiro", "Rio de Janeiro", "Venda", 2, 2, 1390000, 2900, 100, 100, true);
            casa2.setGaragem(true);
            casa2.setQuintal(false);
            casa2.setAndares(-1);
            System.out.println("Casa: " + casa2.ObterImovel());
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
            System.out.println(ex.getMessage());
        }
            
        try {
            Casa casa3 = new Casa("Rua Alvaro Ramos 67/705", "Rio de Janeiro", "Rio de Janeiro", "Venda", 2, 2, 1390000, 1234, 100, 100, true);
            casa3.setGaragem(true);
            casa3.setQuintal(false);
            casa3.setAndares(1);
            System.out.println("Casa: " + casa3.ObterImovel());
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
           System.out.println(ex.getMessage());
        }
            
        try {
            Escritorio escrit1 = new Escritorio("Rua Praia de Botafogo 1200/1301", "Rio de Janeiro", "Rio de Janeiro", "Aluguel", 2, 2, 1390000, 2900, 100, 100, true);
            escrit1.setCondominio(450);
            escrit1.setWifiIncluso(true);
            System.out.println("Escritório: " + escrit1.ObterImovel());
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
            System.out.println(ex.getMessage());
        }
            
        try {
            Escritorio escrit2 = new Escritorio("Rua Praia de Botafogo 1200/1301", "Rio de Janeiro", "Rio de Janeiro", "Aluguel", 2, 2, 1390000, 0, 100, 100, true);
            escrit2.setCondominio(650);
            escrit2.setWifiIncluso(true);
            System.out.println("Escritório: " + escrit2.ObterImovel());
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
            System.out.println(ex.getMessage());
        }
            
        try {
            Escritorio escrit3 = new Escritorio("Rua Praia de Botafogo 1200/1301", "Rio de Janeiro", "Rio de Janeiro", "Aluguel", 2, 2, 1390000, 1230, 100, 100, true);
            escrit3.setCondominio(0);
            escrit3.setWifiIncluso(true);
            System.out.println("Escritório: " + escrit3.ObterImovel());
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException | AndaresNegativoException ex) {
            System.out.println(ex.getMessage());
        }
                
    }
}
