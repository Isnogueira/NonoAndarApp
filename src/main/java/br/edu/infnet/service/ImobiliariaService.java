package br.edu.infnet.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.ImobiliariaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.domain.Imobiliaria;

@Service
@RequiredArgsConstructor
public class ImobiliariaService {

	private final ImobiliariaRepository imobiliariaRepository;

	public List<Imobiliaria> obterLista(Usuario usuario) {
		return imobiliariaRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"nome"));
	}

	public List<Imobiliaria> obterLista() {

		return (List<Imobiliaria>) imobiliariaRepository.findAll();
	}
	
	public void incluir(Imobiliaria imobiliaria) {
		
		imobiliariaRepository.save(imobiliaria);
	}
	
	public void excluir(Integer id) {
		
		imobiliariaRepository.deleteById(id);
	}
	
	public Optional<Imobiliaria> obterPorId(Integer id) {
		
		return imobiliariaRepository.findById(id);
	}
	
	 public int ObterQtde() {
	    	
	    	return (int) imobiliariaRepository.count();
	    }
}
