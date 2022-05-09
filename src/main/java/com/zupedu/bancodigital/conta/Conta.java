package com.zupedu.bancodigital.conta;

import com.zupedu.bancodigital.produto.Produto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentoTitular;

    private String nomeTitular;

    private LocalDateTime abertura;

    private int agencia;

    private long numero;

    private BigDecimal saldo;

    @ManyToMany
    @JoinTable(
            name = "conta_produto",
            joinColumns = @JoinColumn(name = "id_conta"),
            inverseJoinColumns = @JoinColumn(name = "id_produto")
    )
    private List<Produto> produtos = new ArrayList<>();

    /**
     * @deprecated Construtor para uso exclusivo do Hibernate.
     */
    @Deprecated
    public Conta() {
    }
}
