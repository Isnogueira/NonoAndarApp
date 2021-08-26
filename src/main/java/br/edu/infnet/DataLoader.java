package br.edu.infnet;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario usuario = new Usuario();

        usuario.setNome("Ingrid Nogueira");
        usuario.setEmail("ingrid@gmail.com");
        usuario.setSenha("123456");
        usuario.setAdmin(true);

        usuarioRepository.save(usuario);

        System.out.println("Inclusão realizada");
    }
}
