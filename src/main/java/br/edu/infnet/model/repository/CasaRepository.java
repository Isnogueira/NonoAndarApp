package br.edu.infnet.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.domain.Casa;
import br.edu.infnet.model.domain.Gerente;

@Repository
public interface CasaRepository extends CrudRepository<Casa, Integer> {
	
	@Query("FROM Casa c WHERE c.usuario.id = :userId")
    List<Casa> obterLista(Integer userId);
}
