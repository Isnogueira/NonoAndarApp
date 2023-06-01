package br.edu.infnet.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.domain.Gerente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GerenteRepository extends CrudRepository<Gerente, Integer> {

    @Query("FROM Gerente g WHERE g.usuario.id = :userId ORDER BY g.nome ASC")
    List<Gerente> obterLista(Integer userId, Sort sort);

}
