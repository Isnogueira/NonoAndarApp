package br.edu.infnet;

import br.edu.infnet.domain.Gerente;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class GerenteLoader implements ApplicationRunner {

	@Autowired
	private GerenteService gerenteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		Usuario usuario = new Usuario();
//		usuario.setId(1);
//
//		Gerente gerente = new Gerente();
//		gerente.setNome("Gerente 1");
//		gerente.setEmail("gerente@gerente.com");
//		gerente.setTelefone("789456");
//		gerente.setUsuario(usuario);
//
//		gerenteService.incluir(gerente);

	}

}
