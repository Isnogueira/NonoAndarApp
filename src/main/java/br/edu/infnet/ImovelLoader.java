package br.edu.infnet;

import br.edu.infnet.domain.Apartamento;
import br.edu.infnet.domain.Casa;
import br.edu.infnet.domain.Escritorio;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.CasaService;
import br.edu.infnet.service.ApartamentoService;
import br.edu.infnet.service.EscritorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ImovelLoader implements ApplicationRunner {
	
	@Autowired 
	private ApartamentoService apartamentoService;

	@Autowired 
	private CasaService casaService;
	
	@Autowired 
	private EscritorioService escritorioService;

	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		Usuario usuario = new Usuario();
//		usuario.setId(1);
//
//		Apartamento apto = new Apartamento();
//		apto.setEndereco("Botafogo");
//		apto.setValorAluguel(1800);
//		apto.setValorVenda(340000);
//		apto.setValorCondominio(700);
//		apto.setSuite(false);
//		apto.setPetFriendly(false);
//		apto.setVagas(1);
//		apto.setUsuario(usuario);;
//
//		apartamentoService.incluir(apto);
//
//		Casa casa = new Casa();
//		casa.setEndereco("Flamengo");
//		casa.setValorAluguel(3000);
//		casa.setValorVenda(1200000);
//		casa.setGaragem(false);
//		casa.setQuintal(true);
//		casa.setAndares(1);
//		casa.setUsuario(usuario);
//
//		casaService.incluir(casa);
//
//		Escritorio escritorio = new Escritorio();
//		escritorio.setEndereco("Copacabana");
//		escritorio.setValorAluguel(400);
//		escritorio.setValorVenda(1400000);
//		escritorio.setCondominio(600);
//		escritorio.setWifiIncluso(true);
//		escritorio.setPortaria24hrs(false);
//		escritorio.setUsuario(usuario);
//
//		escritorioService.incluir(escritorio);



	}
		
}
	


	

