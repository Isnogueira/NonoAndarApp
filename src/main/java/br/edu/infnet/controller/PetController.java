package br.edu.infnet.controller;

import br.edu.infnet.domain.Pet;
import br.edu.infnet.domain.Procedimento;
import br.edu.infnet.service.ProcedimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.PetService;

import java.util.List;

@Controller
public class PetController {

	
	@Autowired
	private PetService petService;

	@Autowired
	private ProcedimentoService procedimentoService;


	@GetMapping(value = "/pet")
	public String tela() {
		return "/pet/cadastro";
	}

	@GetMapping(value = "/pet/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("pets", petService.obterListaPorUsuario(usuario));
		
		return "/pet/lista";
	}	

	@GetMapping(value = "/pet/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Pet pet = petService.obterPorId(id);
		List<Procedimento> procedimentos = procedimentoService.obterProcedimentosPorPet(pet.getId());

		if(procedimentos.size() > 0){
			procedimentoService.deletarTodosProcedimentosPorId(pet.getId());
		}

		petService.excluir(id);
		
		model.addAttribute("mensagem", "Pet " + pet.getNomePet() + " removido com sucesso!");
		
		return telaLista(model, usuario);
	}


	@PostMapping(value = "/pet/incluir")
	public String incluir(Model model, Pet pet,
						  @SessionAttribute("user") Usuario usuario) {

		petService.incluir(pet, usuario);

		String mensagem = "Pet " + pet.getNomePet() + " cadastrado com sucesso!";

		model.addAttribute("mensagem", mensagem);

		return telaLista(model, usuario);
		//return "/index";
	}

//	@GetMapping(value = "/imovel/busca")
//	public String busca(Model model, String localizacao) {
//
//		model.addAttribute("imoveis", petService.buscarPelaLocalizacao(localizacao));
//
//		return "/index";
//	}
}
