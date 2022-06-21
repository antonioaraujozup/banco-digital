package com.zupedu.bancodigital.application.correntista;

import com.zupedu.bancodigital.adapters.persistence.correntista.CorrentistaRepository;
import com.zupedu.bancodigital.domain.correntista.CadastraNovoCorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/correntista")
public class CorrentistaController {

    @Autowired
    private CadastraNovoCorrentistaService service;


    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovoCorrentistaRequest request,
                                      UriComponentsBuilder uriBuilder) {


        var correntista = service.cadastrar(request);

        var location = uriBuilder.path("/api/correntista/{id}")
                .buildAndExpand(correntista.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }

}
