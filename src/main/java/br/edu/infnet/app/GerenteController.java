package br.edu.infnet.app;

import br.edu.infnet.domain.model.Gerente;
import br.edu.infnet.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @GetMapping(value = "/gerente")
    public String tela(){
        return "/gerente/cadastro";
    }


    @GetMapping(value="/gerente/lista")
    public String telalista(Model model){

        model.addAttribute("lista", gerenteService.obterLista());

        return "/gerente/lista";
    }

    @PostMapping(value = "/gerente/incluir")
    public String incluir(Model model, Gerente gerente) {

        gerenteService.Incluir(gerente);

        model.addAttribute("mensagem","Seja bem vindo(a) " + gerente.getNome());

        return "/gerente/confirmacao";
    }
}
