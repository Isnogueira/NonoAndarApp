package br.edu.infnet.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value="/usuario")
    public String telaRegistro(){
        return "/usuario/registro";
    }

    @PostMapping (value="/usuario")
    public String incluir(Usuario usuario){
    	
        usuarioService.incluir(usuario);

        return "/index";
    }

//    @GetMapping(value="/usuario/lista")
//    public String telaLista(Model model) {
//
//        model.addAttribute("lista", usuarioService.obterLista());
//
//        return "/usuario/lista";
//    }

//    @GetMapping(value = "/usuario/{id}/excluir")
//    public String excluir(Model model, @PathVariable Integer id){
//
//        Optional<Usuario> usuarioExcluido = usuarioService.obterPorId(id);
//
//        String msg = "O gerente não pode ser excluído";
//
//        if(usuarioExcluido.isPresent()){
//            usuarioService.excluir(id);
//            Usuario usuario = usuarioExcluido.get();
//            msg = "O(A) usuário  foi excluído(a) com sucesso!";
//        }
//
//        model.addAttribute("mensagem", msg);
//
//        return telaLista(model);
//
//    }
}
