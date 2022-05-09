package com.zupedu.bancodigital.pagamento;

import com.zupedu.bancodigital.conta.Conta;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataPagamento;
    private String codigoBarras;
    private BigDecimal valor;
    private String codigoConfirmacao;

    @ManyToOne
    private Conta conta;

    /**
     * @deprecated Construtor para uso exclusivo do Hibernate.
     */
    @Deprecated
    public Pagamento() {
    }
}
