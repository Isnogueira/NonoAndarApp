package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    @Query("from Usuario u where u.email = :email and u.senha = :senha")
    Usuario autenticacao(String email, String senha );

}
