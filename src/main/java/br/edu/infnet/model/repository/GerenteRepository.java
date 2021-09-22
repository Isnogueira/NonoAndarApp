package br.edu.infnet.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.model.domain.Gerente;

public interface GerenteRepository extends CrudRepository<Gerente, Integer> {

    @Query("FROM Gerente g WHERE g.usuario.id = :userId ORDER BY g.nome ASC")
    List<Gerente> obterLista(Integer userId, Sort sort);

}
