package br.edu.infnet.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.domain.Imovel;

@Repository
public interface ImovelRepository extends CrudRepository<Imovel, Integer> {

	@Query("from Imovel i where i.usuario.id = :userId")
	public List<Imovel> obterLista(Integer userId);
}
