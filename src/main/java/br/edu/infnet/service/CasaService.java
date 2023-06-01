package br.edu.infnet.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.CasaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.domain.Casa;

@Service
@RequiredArgsConstructor
public class CasaService {
	private final CasaRepository casaRepository;
	
	public List<Casa> obterLista(){
		
		return (List<Casa>) casaRepository.findAll();
	}
	public List<Casa> obterLista(Usuario usuario){
		return casaRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"endereco"));
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
