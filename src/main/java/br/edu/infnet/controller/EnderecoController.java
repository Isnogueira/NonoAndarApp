package br.edu.infnet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.model.service.EnderecoService;

@Controller
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	
	@PostMapping(value = "usuario/cep")
	public String obterCepUsuario(Model model, @RequestParam String cep) {
		
		model.addAttribute("meuEndereco", enderecoService.obterCep(cep));
		
		return "/usuario/registro";
	}

}
