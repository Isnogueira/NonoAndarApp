package br.edu.infnet.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.domain.Escritorio;

import java.util.List;

@Repository
public interface EscritorioRepository extends CrudRepository<Escritorio, Integer>{

	@Query("FROM Escritorio e WHERE e.usuario.id = :userId ORDER BY e.endereco ASC")
    List<Escritorio> obterLista(Integer userId, Sort sort);
}
