package br.edu.infnet.app;

import br.edu.infnet.domain.model.Apartamento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApartamentoController {

    @GetMapping(value = "/apartamento")
    public String tela(){
        return "/apartamento/cadastro";
    }

    @GetMapping(value="/apartamentos")
    public String telalista(){
        return "/apartamento/lista";
    }

    @PostMapping(value = "/apartamento/incluir")
    public String incluir(Model model, Apartamento apartamento) {

        model.addAttribute("end",  apartamento.getEndereco());

        return "/apartamento/confirmacao";
    }
}
