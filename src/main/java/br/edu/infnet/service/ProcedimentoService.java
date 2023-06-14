package br.edu.infnet.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import br.edu.infnet.domain.Procedimento;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.ProcedimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcedimentoService {

	private final ProcedimentoRepository procedimentoRepository;

	public List<Procedimento> obterLista(Usuario usuario) {
		return procedimentoRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"data"));
	}

	public List<Procedimento> obterListaExames(Usuario usuario) {
		return procedimentoRepository.obterListaExames(usuario.getId(), Sort.by(Sort.Direction.ASC,"data"));
	}

	public List<Procedimento> obterListaBanhos(Usuario usuario) {
		return procedimentoRepository.obterListaBanhos(usuario.getId(), Sort.by(Sort.Direction.ASC,"data"));
	}

	public List<Procedimento> obterProcedimentosPorPet(Integer petId) {
		return procedimentoRepository.buscarProcedimentosPorPet(petId);
	}

	public void deletarTodosProcedimentosPorId(Integer id) {
		procedimentoRepository.deletarProcedimentosPorPet(id);
	}

	public List<Procedimento> obterLista() {

		return (List<Procedimento>) procedimentoRepository.findAll();
	}

	public void incluir(Procedimento procedimento) {
		
		procedimentoRepository.save(procedimento);
	}
	
	public void excluir(Integer id) {
		
		procedimentoRepository.deleteById(id);
	}
	
	public Optional<Procedimento> obterPorId(Integer id) {
		
		return procedimentoRepository.findById(id);
	}
	
	 public int ObterQtde() {
	    	
	    	return (int) procedimentoRepository.count();
	    }
}
