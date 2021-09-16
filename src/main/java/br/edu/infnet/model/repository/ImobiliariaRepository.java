package br.edu.infnet.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.domain.Gerente;
import br.edu.infnet.model.domain.Imobiliaria;
import br.edu.infnet.model.domain.Usuario;

public interface ImobiliariaRepository extends CrudRepository<Imobiliaria, Integer> {
	
	@Query("FROM Imobiliaria i WHERE i.usuario.id = :userId")
    List<Imobiliaria> obterLista(Integer userId);
}
