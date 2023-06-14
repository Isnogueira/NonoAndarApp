package br.edu.infnet.service;

import java.util.List;

import br.edu.infnet.domain.Pet;
import br.edu.infnet.domain.Procedimento;
import br.edu.infnet.domain.Usuario;
import br.edu.infnet.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PetService {

	private final PetRepository petRepository;

	public List<Pet> obterListaPorUsuario(Usuario usuario){
		return petRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC,"id"));
	}
	public List<Pet> obterLista(){
		return (List<Pet>) petRepository.findAll();
	}

	public void incluir(Pet pet, Usuario usuario) {

		pet.setUsuario(usuario);
		petRepository.save(pet);
	}

//	public List<Pet> buscarPelaLocalizacao(String localizacao){ return petRepository.buscarImoveisPelaLocalizacao(localizacao); }

	public void excluir(Integer id) {
		petRepository.deleteById(id);
	}
	
	public Pet obterPorId(Integer id) {
		return petRepository.findById(id).orElse(null);
	}

	 public int ObterQtde() {
	    	
	    	return (int) petRepository.count();
	    }
}
