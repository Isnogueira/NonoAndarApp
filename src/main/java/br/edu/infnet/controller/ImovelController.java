package br.edu.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.model.domain.Imovel;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.ImovelService;

@Controller
public class ImovelController {

	
	@Autowired
	private ImovelService imovelService;

	@GetMapping(value = "/imovel/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("imoveis", imovelService.obterLista(usuario));
		
		return "/imovel/lista";
	}	

	@GetMapping(value = "/imovel/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Imovel imovel = imovelService.obterPorId(id);
		
		imovelService.excluir(id);
		
		model.addAttribute("msg", "Imovel " + imovel.getEndereco() + " removido com sucesso!!!");
		
		return telaLista(model, usuario);
	}
}
