package br.edu.infnet.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.domain.Casa;

@Repository
public interface CasaRepository extends CrudRepository<Casa, Integer> {
}
