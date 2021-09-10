package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Apartamento;
import br.edu.infnet.model.service.ApartamentoService;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApartamentoController {
	
	@Autowired
	private ApartamentoService apartamentoService;
	
	@GetMapping(value = "/apartamento/lista")
	public String telaLista(Model model) {
		
		List<Apartamento> apartamentos = apartamentoService.obterLista();
		
		model.addAttribute("apartamentos", apartamentos);
		
		return "/apartamento/lista";
	}
	
	
	@GetMapping(value = "/apartamento")
	public String tela() {
		return "/apartamento/cadastro";
	}
	

	@PostMapping(value = "/apartamento/incluir")
    public String incluir(Model model, Apartamento apartamento) {

		apartamentoService.incluir(apartamento);
		
		model.addAttribute("mensagem", "O apartament foi cadastrado com sucesso!");
			
		return telaLista(model);
	}
	
	
	 @GetMapping(value = "/apartamento/{id}/excluir")
	 public String excluir(Model model, @PathVariable Integer id) {
		 
		 Optional<Apartamento> apartamentoExcluido = apartamentoService.obterPorId(id);
		 
		 String msg = "O apartamento não pode ser excluído";
		 
		 if(apartamentoExcluido.isPresent()) {
			 
			 apartamentoService.excluir(id);
			 
			 Apartamento apartamento = apartamentoExcluido.get();
			 
			 msg = "O apartamento de endereço foi excluído com sucesso!";
			 
			 model.addAttribute("mensagem", msg);
		 }
		 
		 return telaLista(model);
	 }
}
