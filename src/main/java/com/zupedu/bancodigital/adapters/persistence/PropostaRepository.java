package com.zupedu.bancodigital.adapters.persistence;

import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<Proposta,Long> {
}
