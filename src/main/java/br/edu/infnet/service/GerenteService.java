package br.edu.infnet.service;

import br.edu.infnet.domain.model.Gerente;
import br.edu.infnet.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;
import java.util.List;

@Service
public class GerenteService {

    @Autowired
    private GerenteRepository gerenteRepository;

    public List<Gerente> obterLista(){

       return (List<Gerente>) gerenteRepository.findAll();
    }

    public void Incluir(Gerente gerente){

       gerenteRepository.save(gerente);

    }
}
