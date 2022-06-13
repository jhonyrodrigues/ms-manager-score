package com.serasa.desafio.controller;

import com.serasa.desafio.controller.api.AuthApi;
import com.serasa.desafio.gateway.database.dto.LoginIn;
import com.serasa.desafio.gateway.database.dto.TokenOut;
import com.serasa.desafio.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController implements AuthApi {

    private final AuthenticationManager authenticationManager;

    private final TokenService tokenService;

    @Override
    public ResponseEntity<TokenOut> auth(LoginIn loginIn) {

        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(loginIn.getEmail(), loginIn.getSenha());

        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        String token = tokenService.generateToken(authentication);

        return ResponseEntity.ok(TokenOut.builder().type("Bearer").token(token).build());

    }
}