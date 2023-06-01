package br.edu.infnet.service;

import java.util.List;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.ImovelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.domain.Imovel;

@Service
@RequiredArgsConstructor
public class ImovelService {

	private final ImovelRepository imovelRepository;

	public List<Imovel> obterListaPorUsuario(Usuario usuario){
		return imovelRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"endereco"));
	}
	public List<Imovel> obterLista(){
		return (List<Imovel>) imovelRepository.findAll();
	}

	public List<Imovel> buscarPelaLocalizacao(String localizacao){ return imovelRepository.buscarImoveisPelaLocalizacao(localizacao); }

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
