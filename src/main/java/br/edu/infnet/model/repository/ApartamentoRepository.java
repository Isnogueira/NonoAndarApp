package br.edu.infnet.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.domain.Apartamento;


@Repository
public interface ApartamentoRepository extends CrudRepository<Apartamento, Integer> {
	
	@Query("FROM Apartamento a WHERE a.usuario.id = :userId ORDER BY a.endereco ASC")
    List<Apartamento> obterLista(Integer userId, Sort sort);
}
