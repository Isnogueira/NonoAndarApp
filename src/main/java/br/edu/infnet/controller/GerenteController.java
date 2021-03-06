package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Gerente;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @GetMapping(value = "/gerente")
    public String tela(){
        return "/gerente/cadastro";
    }


    @GetMapping(value="/gerente/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("lista", gerenteService.obterLista(usuario));

        return "/gerente/lista";
    }

    @PostMapping(value = "/gerente/incluir")
    public String incluir(Model model, Gerente gerente, @SessionAttribute("user") Usuario usuario) {

        gerente.setUsuario(usuario);

        gerenteService.incluir(gerente);

        model.addAttribute("mensagem", gerente.getNome() + " foi cadastrado com sucesso!");

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/gerente/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario){

        Optional<Gerente> gerenteExcluido = gerenteService.obterPorId(id);

        String msg = null;

	     try {
        	if(gerenteExcluido.isPresent()){
	            gerenteService.excluir(id);
	            Gerente gerente = gerenteExcluido.get();
	            msg = "O(A) gerente " + gerente.getNome() + " foi excluído(a) com sucesso!";
	        }

	     } catch(Exception e){
	    	 
	    	msg = "O gerente não pode ser excluído";
	    	 
	     }
        model.addAttribute("mensagem", msg);

        return telaLista(model, usuario);

    }


}
