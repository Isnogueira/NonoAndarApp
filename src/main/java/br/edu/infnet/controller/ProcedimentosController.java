package br.edu.infnet.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.edu.infnet.domain.Procedimento;
import br.edu.infnet.service.ProcedimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.domain.Pet;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.PetService;

@Controller
public class ProcedimentosController {

	@Autowired
	private ProcedimentoService procedimentoService;

	@Autowired
	private PetService petService;

	@GetMapping(value = "/procedimento")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("pets", petService.obterListaPorUsuario(usuario));

		return "/procedimentos/cadastro";
	}

	@GetMapping(value = "/procedimento/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		List<Procedimento> listaProcedimentos = procedimentoService.obterLista(usuario);

		model.addAttribute("procedimentos", listaProcedimentos);

		return "/procedimentos/lista";
	}

	@PostMapping(value = "/procedimento/incluir")
	public String incluir(Model model, Procedimento procedimento,
						  @SessionAttribute("user") Usuario usuario) {
		String nomePet = procedimento.getPet().getNomePet();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		LocalDate data = LocalDate.parse(procedimento.getData());
		String dataConvertida = fmt.format(data);

		procedimento.setUsuario(usuario);
		procedimento.setNomePet(nomePet);
		procedimento.setData(dataConvertida);
		procedimentoService.incluir(procedimento);

		String mensagem = "Procedimento cadastrado com sucesso!";

		model.addAttribute("mensagem", mensagem);

		return telaLista(model, usuario);
	}

	
	@GetMapping(value = "/procedimento/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

		Optional<Procedimento> procedimentoExcluido = procedimentoService.obterPorId(id);

		String msg = "O procedimento não pode ser excluído";

		if (procedimentoExcluido.isPresent()) {

			procedimentoService.excluir(id);

			msg = "Procedimento excluído com sucesso!";
		}

		model.addAttribute("mensagem", msg);

		return telaLista(model, usuario);

	}

	@GetMapping(value = "/exame/{id}/excluir")
	public String excluirExame(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

		Optional<Procedimento> exameExcluido = procedimentoService.obterPorId(id);

		String msg = "O exame não pode ser excluído";

		if (exameExcluido.isPresent()) {

			procedimentoService.excluir(id);

			msg = "Exame excluído com sucesso!";
		}

		model.addAttribute("mensagem", msg);

		return "/exames/lista";

	}

}
