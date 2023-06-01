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

import br.edu.infnet.domain.Escritorio;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.EscritorioService;

@Controller
public class EscritorioController {
	
	@Autowired
	private EscritorioService escritorioService;
	
	@GetMapping(value = "/escritorio/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		List<Escritorio> escritorios = escritorioService.obterLista(usuario);
		
		model.addAttribute("escritorios", escritorios);
		
		return "/escritorio/lista";
	}
	
	
	@GetMapping(value = "/escritorio")
	public String tela() {
		return "/escritorio/cadastro";
	}
	

	@PostMapping(value = "/escritorio/incluir")
    public String incluir(Model model, Escritorio escritorio, @SessionAttribute("user") Usuario usuario) {

		escritorio.setUsuario(usuario);
		
		escritorioService.incluir(escritorio);
		
		model.addAttribute("mensagem", "O escritorio foi cadastrado com sucesso!");
			
		return telaLista(model, usuario);
	}
	
	
	 @GetMapping(value = "/escritorio/{id}/excluir")
	 public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		 
		 Optional<Escritorio> escritorioExcluido = escritorioService.obterPorId(id);
		 
		 String msg = null;
		 
		 try {
			 if(escritorioExcluido.isPresent()) {
				 
				 escritorioService.excluir(id);
				 
				 Escritorio escritorio = escritorioExcluido.get();
				 
				 msg = "O escritorio foi excluído com sucesso!";
				 
			 }
		 } catch(Exception e){
			 
			 msg = "O escritorio não pode ser excluído";
		 }
		 
		 model.addAttribute("mensagem", msg);
		 
		 return telaLista(model, usuario);
	 }
}
