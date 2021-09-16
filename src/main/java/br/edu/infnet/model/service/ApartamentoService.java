package br.edu.infnet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Apartamento;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.ApartamentoRepository;

@Service
public class ApartamentoService {
	
	@Autowired
	private ApartamentoRepository apartamentoRepository;
	
	
	public List<Apartamento> obterLista(){
	
		return (List<Apartamento>) apartamentoRepository.findAll();
	}
	
	public List<Apartamento> obterLista(Usuario usuario){
		
		return (List<Apartamento>) apartamentoRepository.obterLista(usuario.getId());
	}
	

	public void incluir(Apartamento apartamento) {
		
		apartamentoRepository.save(apartamento);
	}
	
	
	public void excluir(Integer id) {
		
		apartamentoRepository.deleteById(id);
	}
	

	public Optional<Apartamento> obterPorId(Integer id) {
		
		return apartamentoRepository.findById(id);
		
	}
	
}




