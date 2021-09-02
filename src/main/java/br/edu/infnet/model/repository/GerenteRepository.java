package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Gerente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GerenteRepository extends CrudRepository<Gerente, Integer> {

    @Query("FROM Gerente g WHERE g.usuario.id = :userId")
    List<Gerente> obterLista(Integer userId);

}
