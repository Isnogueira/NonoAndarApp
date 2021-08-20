
package br.edu.infnet.model.domain.tests;


import br.edu.infnet.model.domain.*;
import br.edu.infnet.model.domain.exceptions.AluguelNegativoOuZeradoException;
import br.edu.infnet.model.domain.exceptions.AndaresNegativoException;
import br.edu.infnet.model.domain.exceptions.VagasNegativaException;
import br.edu.infnet.model.domain.exceptions.CondominioNegativoOuZeradoException;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.io.ClassPathResource;

public class AppTest {
    
    public static void main(String[] args) {
        
           String dir = System.getProperty("user.dir");
           String arq = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))+".txt";
   
        try {
            
            InputStream resource = new ClassPathResource("static/imobiliarias.txt").getInputStream();
             
            FileWriter fileW = new FileWriter(dir + arq);
            BufferedWriter escrita = new BufferedWriter(fileW);

            BufferedReader leitura = new BufferedReader(new InputStreamReader(resource));
            
            String linha = leitura.readLine();
            
            while (linha != null){
                
                String[] campos = linha.split(";");
                
                switch(campos[0].toUpperCase()){
                    
                    case "0":
                        
                        Gerente gerente = new  Gerente(campos[4],campos[5], campos[6]);
        
                        Imobiliaria imobiliaria = new Imobiliaria(campos[1], campos[2], campos[3]);
                        imobiliaria.setGerente(gerente);
                        
                        System.out.println("Imobiliaria: " + imobiliaria);
                        
                        escrita.write("Imobiliária: " + imobiliaria + "\r\n");
                        
                        break;
                    
                    case "A":
                        
                        Apartamento apartamento = new Apartamento(campos[1], campos[2], campos[3],campos[4], Integer.valueOf(campos[5]),
                                Integer.valueOf(campos[6]), Float.valueOf(campos[7]), Float.valueOf(campos[8]), Integer.valueOf(campos[9]), 
                                Float.valueOf(campos[10]), Boolean.valueOf(campos[11]));
                        
                        apartamento.setValorCondomínio(Integer.valueOf(campos[12]));
                        apartamento.setSuite(Boolean.valueOf(campos[13]));
                        apartamento.setVagas(Integer.valueOf(campos[14]));
                        apartamento.setPetFriendly(Boolean.valueOf(campos[15]));
                        
                        System.out.println("    Apartamento: " + apartamento);
                        
                        escrita.write("     Apartamento: " + apartamento.ObterImovel() + "\r\n");
                        
                        break;
                    
                    case "C":
                        
                        Casa casa = new Casa(campos[1], campos[2], campos[3],campos[4], Integer.valueOf(campos[5]),
                                Integer.valueOf(campos[6]), Float.valueOf(campos[7]), Float.valueOf(campos[8]), Integer.valueOf(campos[9]), 
                                Float.valueOf(campos[10]), Boolean.valueOf(campos[11]));
                        
                        casa.setGaragem(Boolean.valueOf(campos[12]));
                        casa.setQuintal(Boolean.valueOf(campos[13]));
                        casa.setAndares(Integer.valueOf(campos[14]));
                        
                        System.out.println("    Casa:" + casa);
                        
                        escrita.write("     Casa: " + casa.ObterImovel() + "\r\n");
                        
                        break;
                        
                    case "E":
                        
                        Escritorio escritorio = new Escritorio (campos[1], campos[2], campos[3],campos[4], Integer.valueOf(campos[5]),
                                Integer.valueOf(campos[6]), Float.valueOf(campos[7]), Float.valueOf(campos[8]), Integer.valueOf(campos[9]), 
                                Float.valueOf(campos[10]), Boolean.valueOf(campos[11]));
                        
                        escritorio.setCondominio(Float.valueOf(campos[12]));
                        escritorio.setWifiIncluso(Boolean.valueOf(campos[13]));
                        escritorio.setPortaria24hrs(Boolean.valueOf(campos[14]));
                        
                        System.out.println("    Escritório: " + escritorio);
                        
                        escrita.write("     Escritório: " + escritorio.ObterImovel() + "\r\n");
                        
                    default:
                       
			break;
                    
                }
               
                linha = leitura.readLine();
            } 
            
            escrita.close();
            leitura.close();
            fileW.close();
            
        } catch (AluguelNegativoOuZeradoException | CondominioNegativoOuZeradoException | VagasNegativaException
                | AndaresNegativoException | IOException ex) {
             System.out.println(ex.getMessage());
        
        } finally {
          
            System.out.println("Processamento finalizado - " + dir+arq);
        }
    }
    
}
