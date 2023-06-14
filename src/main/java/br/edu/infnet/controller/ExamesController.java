package br.edu.infnet.controller;

import br.edu.infnet.domain.Procedimento;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.PetService;
import br.edu.infnet.service.ProcedimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class ExamesController {

	@Autowired
	private ProcedimentoService procedimentoService;

	@Autowired
	private PetService petService;


	@GetMapping(value = "/exames/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		List<Procedimento> listaExames = procedimentoService.obterListaExames(usuario);

		model.addAttribute("exames", listaExames);

		return "/exames/lista";
	}


}
