package br.edu.infnet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Casa;
import br.edu.infnet.model.service.CasaService;

@Controller
public class CasaController {
	
	@Autowired
	private CasaService casaService;
	
	@GetMapping(value = "/casa/lista")
	public String telaLista(Model model) {
		
		List<Casa> casas = casaService.obterLista();
		
		model.addAttribute("casas", casas);
	
		return "/casa/lista";
	}
	
	@GetMapping(value = "/casa")
	public String telaCadastro() {
		return "/casa/cadastro";
	}
	
	@PostMapping(value = "/casa/incluir")
	public String incluir(Model model, Casa casa) {
		
		casaService.incluir(casa);
		
		model.addAttribute("mensagem", "A casa foi cadastrada com sucesso!");
		
		
		return telaLista(model);
	}
	
	
	@GetMapping(value = "/casa/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		
		Optional<Casa> casaExcluida = casaService.obterPorId(id);
		
		String msg = "A casa não pode ser excluída";
		
		if(casaExcluida.isPresent()) {
			
			casaService.excluir(id);
			
			Casa casa = casaExcluida.get();
			
			msg = "A casa de endereço foi excluída com sucesso!";
			
			model.addAttribute("mensagem", msg);
			
		}
		
		
		return telaLista(model);
	}
	
}

