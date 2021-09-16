package br.edu.infnet.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Imobiliaria;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.ImobiliariaRepository;

@Service
public class ImobiliariaService {

	@Autowired
	private ImobiliariaRepository imobiliariaRepository;

	public List<Imobiliaria> obterLista(Usuario usuario) {

		return imobiliariaRepository.obterLista(usuario.getId());
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
}
