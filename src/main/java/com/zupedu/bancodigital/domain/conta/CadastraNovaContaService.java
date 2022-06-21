package com.zupedu.bancodigital.domain.conta;

import com.zupedu.bancodigital.domain.correntista.RetornaCorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovaContaService {

    @Autowired
    private RetornaCorrentistaRepository retornaCorrentistaRepository;

    @Autowired
    private CadastraNovaContaRepository cadastraNovaContaRepository;

    public Conta cadastrar(DadosNovaConta dadosNovaConta) {
        Conta conta = dadosNovaConta.toModel(retornaCorrentistaRepository);

        return cadastraNovaContaRepository.salvar(conta);
    }

}
