package com.zupedu.bancodigital.adapters.persistence;

import com.zupedu.bancodigital.domain.CadastraNovaPropostaRepository;
import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.stereotype.Component;

@Component
public class SqlPropostaRepository implements CadastraNovaPropostaRepository {

    private final PropostaRepository propostaRepository;

    public SqlPropostaRepository(PropostaRepository propostaRepository) {
        this.propostaRepository = propostaRepository;
    }

    @Override
    public Proposta salvar(Proposta proposta) {
        return propostaRepository.save(proposta);
    }
}
