package br.edu.infnet.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.EscritorioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.domain.Escritorio;

@Service
@RequiredArgsConstructor
public class EscritorioService {
	private final EscritorioRepository escritorioRepository;
	
	
	public List<Escritorio> obterLista(){
	
		return (List<Escritorio>) escritorioRepository.findAll();
	}
	
	public List<Escritorio> obterLista(Usuario usuario){

		return escritorioRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"endereco"));
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
	
	 public int ObterQtde() {
	    	
	    	return (int) escritorioRepository.count();
	    }
}
