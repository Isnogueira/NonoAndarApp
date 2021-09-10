package br.edu.infnet.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.client.IEnderecoClient;
import br.edu.infnet.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	IEnderecoClient enderecoClient;
	
	public Endereco obterCep(String cep) {
		
		return enderecoClient.obterCep(cep);
	}

}
