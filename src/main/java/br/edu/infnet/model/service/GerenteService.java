package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Gerente;
import br.edu.infnet.model.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GerenteService {

     @Autowired
    private GerenteRepository gerenteRepository;

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
}
