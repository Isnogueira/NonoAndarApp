package br.edu.infnet.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.domain.Imobiliaria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImobiliariaRepository extends CrudRepository<Imobiliaria, Integer> {
	
	@Query("FROM Imobiliaria i WHERE i.usuario.id = :userId ORDER BY i.nome ASC")
    List<Imobiliaria> obterLista(Integer userId, Sort sort);
}
