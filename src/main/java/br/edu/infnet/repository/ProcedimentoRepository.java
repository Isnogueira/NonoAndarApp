package br.edu.infnet.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.domain.Procedimento;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ProcedimentoRepository extends CrudRepository<Procedimento, Integer> {
	
	@Query("FROM Procedimento p WHERE p.usuario.id = :userId ORDER BY p.data ASC")
    List<Procedimento> obterLista(Integer userId, Sort sort);

    @Query("FROM Procedimento p WHERE p.usuario.id = :userId AND lower(p.tipo) LIKE '%exame%' ORDER BY p.data ASC")
    List<Procedimento> obterListaExames(Integer userId, Sort sort);

    @Query("FROM Procedimento p WHERE p.usuario.id = :userId AND lower(p.tipo) LIKE '%banho%' OR lower(p.tipo) LIKE '%tosa%' ORDER BY p.data ASC")
    List<Procedimento> obterListaBanhos(Integer userId, Sort sort);

    @Query("FROM Procedimento p WHERE p.pet.id = :petId")
    List<Procedimento> buscarProcedimentosPorPet(Integer petId);

    @Modifying
    @Query("DELETE FROM Procedimento p WHERE p.pet.id = :petId")
    void deletarProcedimentosPorPet(Integer petId);

}
