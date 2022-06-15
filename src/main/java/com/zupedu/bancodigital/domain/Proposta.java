package com.zupedu.bancodigital.domain;

import javax.persistence.*;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Embedded
    private Endereco endereco;

    public Proposta(String nome, String cpf, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    /**
     * @deprecated Construtor para uso exclusivo do Hibernate
     */
    @Deprecated
    public Proposta() {
    }

    public Long getId() {
        return id;
    }

}
