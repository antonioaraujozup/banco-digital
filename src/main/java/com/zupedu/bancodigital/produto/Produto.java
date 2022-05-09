package com.zupedu.bancodigital.produto;

import com.zupedu.bancodigital.conta.Conta;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private TipoDeCobranca tipoCobranca;

    private LocalDateTime dataCriacao;

    @ManyToMany(mappedBy = "produtos")
    private List<Conta> contas = new ArrayList<>();

    /**
     * @deprecated Construtor para uso exclusivo do Hibernate.
     */
    @Deprecated
    public Produto() {
    }

}
