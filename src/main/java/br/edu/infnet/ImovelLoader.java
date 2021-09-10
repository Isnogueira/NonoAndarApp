package br.edu.infnet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Apartamento;
import br.edu.infnet.model.service.ApartamentoService;

@Component
public class ImovelLoader implements ApplicationRunner {
	
	@Autowired 
	private ApartamentoService apartamentoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Apartamento apto = new Apartamento();
		apto.setTipoAquisicao("Aluguel");
		apto.setQuartos(2);
		apto.setBanheiros(2);
		apto.setValorAluguel(3000);
		apto.setValorVenda(1400000);
		apto.setMetrosQuadrados(100);
		apto.setValorMetroQuadrado(100);
		apto.setValorCondomínio(900);
		apto.setMobiliado(false);
		apto.setSuite(false);
		apto.setPetFriendly(false);
		apto.setVagas(1);
		
		apartamentoService.incluir(apto);
		
		Apartamento apto2 = new Apartamento();
		apto2.setTipoAquisicao("Venda");
		apto2.setQuartos(3);
		apto2.setBanheiros(2);
		apto2.setValorAluguel(3000);
		apto2.setValorVenda(1400000);
		apto2.setMetrosQuadrados(100);
		apto2.setValorMetroQuadrado(100);
		apto2.setValorCondomínio(900);
		apto2.setMobiliado(false);
		apto2.setSuite(false);
		apto2.setPetFriendly(false);
		apto2.setVagas(1);
		
		apartamentoService.incluir(apto2);
		
		
		for(Apartamento a : apartamentoService.obterLista()) {
			
			System.out.println(a);
		}
		
		
		apartamentoService.excluir(1);
		
		
		for(Apartamento a : apartamentoService.obterLista()) {
			
			System.out.println(a);
		}
	
	
		apartamentoService.obterPorId(2);
		

	}
		
}
	


	

