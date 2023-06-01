package br.edu.infnet.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.ApartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.domain.Apartamento;

@Service
@RequiredArgsConstructor
public class ApartamentoService {
	private final ApartamentoRepository apartamentoRepository;


	public List<Apartamento> obterLista(){

		return (List<Apartamento>) apartamentoRepository.findAll();
	}

	public List<Apartamento> obterLista(Usuario usuario){

		return (List<Apartamento>) apartamentoRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"endereco"));
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

	 public int ObterQtde() {

	    	return (int) apartamentoRepository.count();
	    }
}




