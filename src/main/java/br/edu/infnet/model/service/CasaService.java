package br.edu.infnet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Casa;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.CasaRepository;

@Service
public class CasaService {
	
	@Autowired
	private CasaRepository casaRepository;
	
	public List<Casa> obterLista(){
		
		return (List<Casa>) casaRepository.findAll();
	}
	public List<Casa> obterLista(Usuario usuario){
		
		return (List<Casa>) casaRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"endereco"));
	}
	
	public void incluir(Casa casa) {
		
		casaRepository.save(casa);
	}
	
	public void excluir(Integer id) {
		
		casaRepository.deleteById(id);
	}
	
	public Optional<Casa> obterPorId(Integer id){
		
		return casaRepository.findById(id);
	}
	
	 public int ObterQtde() {
	    	
	    	return (int) casaRepository.count();
	    }
}
