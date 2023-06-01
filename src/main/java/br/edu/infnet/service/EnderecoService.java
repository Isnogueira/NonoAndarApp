package br.edu.infnet.service;

import br.edu.infnet.client.IEnderecoClient;
import br.edu.infnet.domain.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {
	private final IEnderecoClient enderecoClient;
	
	public Endereco obterCep(String cep) {
		
		return enderecoClient.obterCep(cep);
	}

}
