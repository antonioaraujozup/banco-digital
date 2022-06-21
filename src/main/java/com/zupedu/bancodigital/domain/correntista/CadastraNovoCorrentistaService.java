package com.zupedu.bancodigital.domain.correntista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovoCorrentistaService {

    @Autowired
    private CadastraNovoCorrentistaRepository repository;

    public Correntista cadastrar(DadosNovoCorrentista dadosNovoCorrentista) {
        Correntista correntista = dadosNovoCorrentista.toModel();

        return repository.salva(correntista);
    }

}
