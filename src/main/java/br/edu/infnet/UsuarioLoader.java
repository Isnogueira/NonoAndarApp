package br.edu.infnet;

import br.edu.infnet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Usuario usuario = new Usuario();
//        usuario.setEmail("ingrid@gmail.com");
//        usuario.setSenha("123456");
//
//        usuarioRepository.save(usuario);
    }
}
