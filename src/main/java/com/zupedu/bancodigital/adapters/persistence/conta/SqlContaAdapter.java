package com.zupedu.bancodigital.adapters.persistence.conta;

import com.zupedu.bancodigital.domain.conta.CadastraNovaContaRepository;
import com.zupedu.bancodigital.domain.conta.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlContaAdapter implements CadastraNovaContaRepository {

    @Autowired
    private ContaRepository repository;

    @Override
    public Conta salvar(Conta conta) {
        return repository.save(conta);
    }

}
