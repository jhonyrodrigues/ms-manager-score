package com.serasa.desafio.controller.api;

import com.serasa.desafio.gateway.database.dto.LoginIn;
import com.serasa.desafio.gateway.database.dto.TokenOut;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
public interface AuthApi {

    @PostMapping
    ResponseEntity<TokenOut> auth(@RequestBody @Validated LoginIn loginIn);

}