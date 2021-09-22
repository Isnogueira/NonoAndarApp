package br.edu.infnet.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.model.domain.Imobiliaria;

public interface ImobiliariaRepository extends CrudRepository<Imobiliaria, Integer> {
	
	@Query("FROM Imobiliaria i WHERE i.usuario.id = :userId ORDER BY i.nome ASC")
    List<Imobiliaria> obterLista(Integer userId, Sort sort);
}
