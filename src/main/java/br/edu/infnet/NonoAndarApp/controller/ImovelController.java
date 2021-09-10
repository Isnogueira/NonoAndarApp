package br.edu.infnet.NonoAndarApp.controller;

import br.edu.infnet.NonoAndarApp.model.domain.Imovel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImovelController {

    @GetMapping(value = "/imovel")
    public String tela() {
        System.out.println("Entre no get");
        return "imovel/cadastro";
    }

    @PostMapping(value = "/imovel/incluir")
    public String incluir(Imovel imovel) {
        System.out.println(imovel.getEndereco());

        return "imovel/confirmacao";
    }
}

