package br.edu.infnet.client;


import br.edu.infnet.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "localClient")
public interface ILocalClient {

    @GetMapping(value = "/{cep}/json/", produces = "application/json")
    Endereco obterEnderecoPorCep(@PathVariable int cep);
}
