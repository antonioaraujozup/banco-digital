package com.zupedu.bancodigital.application.conta;

import com.zupedu.bancodigital.domain.conta.CadastraNovaContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/contas")
public class ContaController {

    @Autowired
    private CadastraNovaContaService service;

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovaContaRequest request,
                                      UriComponentsBuilder uriBuilder) {


        var conta = service.cadastrar(request);

        var location = uriBuilder.path("/api/contas/{id}")
                .buildAndExpand(conta.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
