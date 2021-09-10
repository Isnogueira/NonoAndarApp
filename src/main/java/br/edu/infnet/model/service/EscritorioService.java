package br.edu.infnet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Escritorio;
import br.edu.infnet.model.repository.EscritorioRepository;

@Service
public class EscritorioService {
	
	@Autowired
	private EscritorioRepository escritorioRepository;
	
	
	public List<Escritorio> obterLista(){
	
		return (List<Escritorio>) escritorioRepository.findAll();
	}
	

	public void incluir(Escritorio escritorio) {
		
		escritorioRepository.save(escritorio);
	}
	
	
	public void excluir(Integer id) {
		
		escritorioRepository.deleteById(id);
	}
	

	public Optional<Escritorio> obterPorId(Integer id) {
		
		return escritorioRepository.findById(id);
		
	}
}
