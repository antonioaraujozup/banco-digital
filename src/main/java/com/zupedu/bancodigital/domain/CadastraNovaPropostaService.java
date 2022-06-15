package com.zupedu.bancodigital.domain;

import org.springframework.stereotype.Service;

@Service
public class CadastraNovaPropostaService {

    private final CadastraNovaPropostaRepository repository;

    public CadastraNovaPropostaService(CadastraNovaPropostaRepository repository) {
        this.repository = repository;
    }

    public Proposta cadastra(DadosNovaProposta dadosNovaProposta) {
        Proposta proposta = dadosNovaProposta.toModel();

        return repository.salvar(proposta);
    }

}
