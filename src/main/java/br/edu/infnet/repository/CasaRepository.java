package br.edu.infnet.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.domain.Casa;

import java.util.List;

@Repository
public interface CasaRepository extends CrudRepository<Casa, Integer> {

	@Query("FROM Casa c WHERE c.usuario.id = :userId ORDER BY c.endereco ASC")
    List<Casa> obterLista(Integer userId, Sort sort);
}
