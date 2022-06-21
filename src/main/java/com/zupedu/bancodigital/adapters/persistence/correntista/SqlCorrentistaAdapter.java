package com.zupedu.bancodigital.adapters.persistence.correntista;

import com.zupedu.bancodigital.domain.correntista.CadastraNovoCorrentistaRepository;
import com.zupedu.bancodigital.domain.correntista.Correntista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlCorrentistaAdapter implements CadastraNovoCorrentistaRepository {

    @Autowired
    private CorrentistaRepository repository;

    @Override
    public Correntista salva(Correntista correntista) {
        return repository.save(correntista);
    }

}
