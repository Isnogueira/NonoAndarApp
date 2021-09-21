package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Apartamento;
import br.edu.infnet.model.domain.Casa;
import br.edu.infnet.model.domain.Escritorio;
import br.edu.infnet.model.domain.Gerente;
import br.edu.infnet.model.domain.Imobiliaria;
import br.edu.infnet.model.domain.Imovel;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.ImobiliariaService;

@Component
@Order(4)
public class ImobiliariaLoader implements ApplicationRunner{

	@Autowired
	private ImobiliariaService imobiliariaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Gerente gerente = new Gerente();
		gerente.setId(1);
		
		Apartamento apto = new Apartamento();
		apto.setId(1);

		Casa casa = new Casa();
		casa.setId(2);
		
		Escritorio escritorio = new Escritorio();
		escritorio.setId(2);
		
		List<Imovel> imoveis = new ArrayList<Imovel>();
		imoveis.add(apto);
		imoveis.add(casa);
		imoveis.add(escritorio);
		
		Imobiliaria imobiliaria = new Imobiliaria();
		imobiliaria.setNome("Primeira Imobiliária");
		imobiliaria.setTelefone("778554");
		imobiliaria.setImoveis(imoveis);
		imobiliaria.setGerente(gerente);
		imobiliaria.setUsuario(usuario);
		
		imobiliariaService.incluir(imobiliaria);
	}

}
