package br.edu.infnet.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.GerenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.domain.Gerente;

@Service
@RequiredArgsConstructor
public class GerenteService {

    private final GerenteRepository gerenteRepository;

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
