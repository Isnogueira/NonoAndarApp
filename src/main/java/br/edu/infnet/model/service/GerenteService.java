package br.edu.infnet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Gerente;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.GerenteRepository;

@Service
public class GerenteService {

     @Autowired
    private GerenteRepository gerenteRepository;

     public List<Gerente> obterLista(Usuario usuario){
         return gerenteRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"nome"));
     }

    public List<Gerente> obterLista(){

       return (List<Gerente>) gerenteRepository.findAll();
    }

    public void incluir(Gerente gerente){

       gerenteRepository.save(gerente);

    }

    public void excluir(Integer id){

        gerenteRepository.deleteById(id);
    }

    public Optional<Gerente> obterPorId(Integer id){

        return gerenteRepository.findById(id);
    }
    
 public int ObterQtde() {
    	
    	return (int) gerenteRepository.count();
    }

}
