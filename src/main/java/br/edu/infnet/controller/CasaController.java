package br.edu.infnet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.domain.Casa;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.CasaService;

@Controller
public class CasaController {
	
	@Autowired
	private CasaService casaService;
	
	@GetMapping(value = "/casa/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		List<Casa> casas = casaService.obterLista(usuario);
		
		model.addAttribute("casas", casas);
	
		return "/casa/lista";
	}
	
	@GetMapping(value = "/casa")
	public String telaCadastro() {
		return "/casa/cadastro";
	}
	
	@PostMapping(value = "/casa/incluir")
	public String incluir(Model model, Casa casa, @SessionAttribute("user") Usuario usuario) {
		
		casa.setUsuario(usuario);
		
		casaService.incluir(casa);
		
		model.addAttribute("mensagem", "A casa foi cadastrada com sucesso!");
		
		
		return telaLista(model, usuario);
	}
	
	
	@GetMapping(value = "/casa/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Optional<Casa> casaExcluida = casaService.obterPorId(id);
		
		String msg = null;
		
		try {
			if(casaExcluida.isPresent()) {
				
				casaService.excluir(id);
				
				Casa casa = casaExcluida.get();
				
				msg = "A casa foi excluída com sucesso!";	
				
			}
		}catch (Exception e) {
			
			msg = "A casa não pode ser excluída";
		}
		
		model.addAttribute("mensagem", msg);
		
		return telaLista(model, usuario);
	}
	
}

