package br.edu.infnet.model.service;

import br.edu.infnet.client.ILocalClient;
import br.edu.infnet.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService {
    @Autowired
    ILocalClient localClient;

    public Endereco obterEnderecoPorCep(int cep) {
        return localClient.obterEnderecoPorCep(cep);
    }
}