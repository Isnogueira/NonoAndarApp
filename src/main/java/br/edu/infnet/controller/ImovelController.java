package br.edu.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.domain.Imovel;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.ImovelService;

@Controller
public class ImovelController {

	
	@Autowired
	private ImovelService imovelService;

	@GetMapping(value = "/imovel/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("imoveis", imovelService.obterListaPorUsuario(usuario));
		
		return "/imovel/lista";
	}	

	@GetMapping(value = "/imovel/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Imovel imovel = imovelService.obterPorId(id);
		
		imovelService.excluir(id);
		
		model.addAttribute("msg", "Imovel " + imovel.getEndereco() + " removido com sucesso!!!");
		
		return telaLista(model, usuario);
	}

	@GetMapping(value = "/imovel/busca")
	public String busca(Model model, String localizacao) {

		model.addAttribute("imoveis", imovelService.buscarPelaLocalizacao(localizacao));

		return "/index";
	}
}
