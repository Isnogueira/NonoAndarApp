package br.edu.infnet.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.domain.Escritorio;

@Repository
public interface EscritorioRepository extends CrudRepository<Escritorio, Integer>{
	
	@Query("FROM Escritorio e WHERE e.usuario.id = :userId ORDER BY e.endereco ASC")
    List<Escritorio> obterLista(Integer userId, Sort sort);
}
