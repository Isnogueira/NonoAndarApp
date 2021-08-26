package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value="/usuario")
    public String telaCadastro(){
        return "/registro";
    }

    @PostMapping (value="/usuario")
    public String incluir(Usuario usuario){

        usuarioService.incluir(usuario);

        System.out.println("Inclusão realizada com sucesso:" + usuario.getNome());

        return "redirect:/";
    }
}
