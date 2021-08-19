package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Gerente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {

    @GetMapping(value="/")
    public String telaLogin(){
        return "/login";
    }

    @PostMapping(value = "/login")
    public String telaInicial(Model model, @RequestParam String email , @RequestParam String senha ){

        Gerente gerente = null;

        if(email.equals(senha)){
             gerente = new Gerente("Ingrid Nogueira", email);
        }

        if (gerente != null) {

            return "/index";

        } else{
            model.addAttribute("mensagem","Autenticação inválida para o gerente " + email + "!");
            return "/login";

        }

    }
}
