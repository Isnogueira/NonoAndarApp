package br.edu.infnet.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.domain.Imovel;

import java.util.List;

@Repository
public interface ImovelRepository extends CrudRepository<Imovel, Integer> {

	@Query("from Imovel i where i.usuario.id = :userId ORDER BY i.endereco ASC")
	public List<Imovel> obterLista(Integer userId, Sort sort);

	@Query("from Imovel i where i.endereco =: localizacao or lower(i.endereco) LIKE lower(CONCAT('%',:localizacao,'%'))")
	List<Imovel> buscarImoveisPelaLocalizacao(String localizacao);
}
