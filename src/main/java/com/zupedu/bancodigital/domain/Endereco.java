package com.zupedu.bancodigital.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private Integer numero;

    private String complemento;

    @Column(nullable = false)
    private String cep;

    public Endereco(String logradouro, Integer numero, String complemento, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Endereco() {
    }

}
