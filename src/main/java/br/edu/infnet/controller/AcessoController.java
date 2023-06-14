package br.edu.infnet.controller;

import br.edu.infnet.service.*;
import jakarta.servlet.http.*;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.ProcedimentoService;

@SessionAttributes("user")
@Controller
@RequiredArgsConstructor
public class AcessoController {
	private final UsuarioService usuarioService;
	private final ProcedimentoService imobiliariaService;
	private final PetService petService;

	
	@GetMapping(value = "/")
	public String telaHome(Model model) {


//		Map<String, Integer> mapaUsuarios = new HashMap<String, Integer>();
//		Map<String, Integer> mapaGerentes = new HashMap<String, Integer>();
//		Map<String, Integer> mapaAptos = new HashMap<String, Integer>();
//		Map<String, Integer> mapaCasas = new HashMap<String, Integer>();
//		Map<String, Integer> mapaEscritorios = new HashMap<String, Integer>();
//		Map<String, Integer> mapaImobiliarias = new HashMap<String, Integer>();
		//Map<String, Integer> mapaImoveis = new HashMap<String, Integer>();
//
//		mapaUsuarios.put("Usuários", usuarioService.ObterQtde());
//		model.addAttribute("mapaUsuarios", mapaUsuarios);
//
//		mapaGerentes.put("Gerentes", gerenteService.ObterQtde());
//		model.addAttribute("mapaGerentes", mapaGerentes);
//
//		mapaAptos.put("Apartamentos", apartamentoService.ObterQtde());
//		model.addAttribute("mapaAptos", mapaAptos);
//
//		mapaCasas.put("Casas", casaService.ObterQtde());
//		model.addAttribute("mapaCasas", mapaCasas);
//
//		mapaEscritorios.put("Escritórios", escritorioService.ObterQtde());
//		model.addAttribute("mapaEscritorios", mapaEscritorios);
//
//		mapaImobiliarias.put("Imobiliárias", imobiliariaService.ObterQtde());
//		model.addAttribute("mapaImobiliarias", mapaImobiliarias);
//
	//	model.addAttribute("pets", petService.obterLista());

//

		return "/index";
	}


	@GetMapping(value = "/login")
	public String telaLogin() {
		return "/login";
	}

	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();

		session.removeAttribute("user");

		return "redirect:/";
	}

	@PostMapping(value = "/login")
	public String telaInicial(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario usuario = usuarioService.validar(email, senha);

		if (usuario != null) {

			model.addAttribute("user", usuario);

			return "/index";

		} else {
			model.addAttribute("mensagem", "Autenticação inválida para o usuario " + email + "!");
			return "/login";

		}

	}
}
