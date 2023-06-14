package br.edu.infnet.repository;

import br.edu.infnet.domain.Pet;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends CrudRepository<Pet, Integer> {

	@Query("from Pet i where i.usuario.id = :userId ORDER BY i.id ASC")
	 List<Pet> obterLista(Integer userId, Sort sort);

//	@Query("from Pet i where i.endereco =: localizacao or lower(i.endereco) LIKE lower(CONCAT('%',:localizacao,'%'))")
//	List<Pet> buscarImoveisPelaLocalizacao(String localizacao);
}
