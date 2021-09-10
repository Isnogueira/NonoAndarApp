package br.edu.infnet.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name="enderecoClient")
public interface IEnderecoClient {
	
	@GetMapping(value = "/{cep}/json")
	Endereco obterCep(@PathVariable String cep);
}
