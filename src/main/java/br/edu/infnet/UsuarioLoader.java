package br.edu.infnet;

import br.edu.infnet.model.domain.Endereco;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.UsuarioRepository;
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

    	Endereco endereco = new Endereco();
    	endereco.setCep("00000000");
    	endereco.setLogradouro("Rua do usuario");
    	endereco.setComplemento("34/1200");
    	endereco.setBairro("Bairro usuario");
    	endereco.setLocalidade("Localidade do usuario");
   
    	
        Usuario usuario = new Usuario();

        usuario.setNome("Ingrid Nogueira");
        usuario.setEmail("ingrid@gmail.com");
        usuario.setSenha("123456");
        usuario.setAdmin(true);
        usuario.setEndereco(endereco);

        usuarioRepository.save(usuario);
    }
}
