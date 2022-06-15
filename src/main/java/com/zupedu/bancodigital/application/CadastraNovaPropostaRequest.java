package com.zupedu.bancodigital.application;

import com.zupedu.bancodigital.domain.DadosNovaProposta;
import com.zupedu.bancodigital.domain.Endereco;
import com.zupedu.bancodigital.domain.Proposta;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class CadastraNovaPropostaRequest implements DadosNovaProposta {

    @NotBlank
    private String nome;

    @NotBlank
    @CPF
    private String cpf;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String logradouro;

    @NotNull
    @Positive
    private Integer numero;

    private String complemento;

    @NotBlank
    private String cep;

    public CadastraNovaPropostaRequest(String nome, String cpf, String email, String logradouro, Integer numero, String complemento, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public CadastraNovaPropostaRequest() {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public Proposta toModel() {
        Endereco endereco = new Endereco(logradouro,numero,complemento,cep);

        return new Proposta(nome,cpf,email,endereco);
    }

}
