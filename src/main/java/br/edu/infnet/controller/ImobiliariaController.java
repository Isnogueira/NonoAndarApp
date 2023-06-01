package br.edu.infnet.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.domain.Imobiliaria;
import br.edu.infnet.domain.Imovel;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.GerenteService;
import br.edu.infnet.service.ImobiliariaService;
import br.edu.infnet.service.ImovelService;

@Controller
public class ImobiliariaController {

	@Autowired
	private ImobiliariaService imobiliariaService;

	@Autowired
	private GerenteService gerenteService;

	@Autowired
	private ImovelService imovelService;

	@GetMapping(value = "/imobiliaria")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("gerentes", gerenteService.obterLista(usuario));

		model.addAttribute("imoveis", imovelService.obterListaPorUsuario(usuario));

		return "/imobiliaria/cadastro";
	}

	@GetMapping(value = "/imobiliaria/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("imobiliarias", imobiliariaService.obterLista(usuario));

		return "/imobiliaria/lista";
	}

	@PostMapping(value = "/imobiliaria/incluir")
	public String incluir(Model model, Imobiliaria imobiliaria, @RequestParam String[] imoveisId,
			@SessionAttribute("user") Usuario usuario) {

		List<Imovel> imoveis = new ArrayList<Imovel>();

		for (String id : imoveisId) {
			imoveis.add(imovelService.obterPorId(Integer.valueOf(id)));
		}

		imobiliaria.setImoveis(imoveis);
		
		imobiliaria.setUsuario(usuario);

		imobiliariaService.incluir(imobiliaria);

		String mensagem = "A imobiliaria  " + imobiliaria.getNome() + " foi cadastrada com sucesso!";

		model.addAttribute("msg", mensagem);

		return telaLista(model, usuario);
	}

	
	@GetMapping(value = "/imobiliaria/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

		Optional<Imobiliaria> imobiliariaExcluida = imobiliariaService.obterPorId(id);

		String msg = "A imobiliaria não pode ser excluída";

		if (imobiliariaExcluida.isPresent()) {

			imobiliariaService.excluir(id);

			Imobiliaria imobiliaria = imobiliariaExcluida.get();

			msg = "A imobiliaria " + imobiliaria.getNome() + " foi excluída com sucesso!";
		}

		model.addAttribute("mensagem", msg);

		return telaLista(model, usuario);

	}
}
