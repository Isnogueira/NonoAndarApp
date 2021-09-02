package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Gerente;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterLista(){
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Optional<Usuario> obterPorId(Integer id){

        return usuarioRepository.findById(id);
    }

    public Usuario validar(String email, String Senha){

       return usuarioRepository.autenticacao(email, Senha);
    }

    public void incluir(Usuario usuario){

        usuarioRepository.save(usuario);
    }

    public void excluir(Integer id){

        usuarioRepository.deleteById(id);
    }
}
