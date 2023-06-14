package br.edu.infnet.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.domain.Usuario;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

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

    public int ObterQtde() {

    	return (int) usuarioRepository.count();
    }
}
