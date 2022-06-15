package com.zupedu.bancodigital.application;

import com.zupedu.bancodigital.domain.CadastraNovaPropostaService;
import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/propostas")
public class CadastraNovaPropostaController {

    private final CadastraNovaPropostaService service;

    public CadastraNovaPropostaController(CadastraNovaPropostaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody @Valid CadastraNovaPropostaRequest request,
                                       UriComponentsBuilder uriComponentsBuilder) {
        Proposta proposta = service.cadastra(request);

        URI location = uriComponentsBuilder
                .path("/propostas/{id}")
                .buildAndExpand(proposta.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
