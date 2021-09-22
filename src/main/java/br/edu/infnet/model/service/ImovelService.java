package br.edu.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Imovel;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.ImovelRepository;

@Service
public class ImovelService {
	
	@Autowired
	private ImovelRepository imovelRepository;

	public List<Imovel> obterLista(Usuario usuario){
		return (List<Imovel>) imovelRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"endereco"));
	}
	public List<Imovel> obterLista(){
		return (List<Imovel>) imovelRepository.findAll();
	}

	public void excluir(Integer id) {
		imovelRepository.deleteById(id);
	}
	
	public Imovel obterPorId(Integer id) {
		return imovelRepository.findById(id).orElse(null);
	}

	 public int ObterQtde() {
	    	
	    	return (int) imovelRepository.count();
	    }
}
