package br.edu.infnet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Escritorio;
import br.edu.infnet.model.service.EscritorioService;

@Controller
public class EscritorioController {
	
	@Autowired
	private EscritorioService escritorioService;
	
	@GetMapping(value = "/escritorio/lista")
	public String telaLista(Model model) {
		
		List<Escritorio> escritorios = escritorioService.obterLista();
		
		model.addAttribute("escritorios", escritorios);
		
		return "/escritorio/lista";
	}
	
	
	@GetMapping(value = "/escritorio")
	public String tela() {
		return "/escritorio/cadastro";
	}
	

	@PostMapping(value = "/escritorio/incluir")
    public String incluir(Model model, Escritorio escritorio) {

		escritorioService.incluir(escritorio);
		
		model.addAttribute("mensagem", "O escritorio foi cadastrado com sucesso!");
			
		return telaLista(model);
	}
	
	
	 @GetMapping(value = "/escritorio/{id}/excluir")
	 public String excluir(Model model, @PathVariable Integer id) {
		 
		 Optional<Escritorio> escritorioExcluido = escritorioService.obterPorId(id);
		 
		 String msg = "O escritorio não pode ser excluído";
		 
		 if(escritorioExcluido.isPresent()) {
			 
			 escritorioService.excluir(id);
			 
			 Escritorio escritorio = escritorioExcluido.get();
			 
			 msg = "O escritorio foi excluído com sucesso!";
			 
			 model.addAttribute("mensagem", msg);
		 }
		 
		 return telaLista(model);
	 }
}
