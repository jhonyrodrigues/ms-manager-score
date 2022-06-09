package com.serasa.desafio.controller.api;

import com.serasa.desafio.gateway.database.dto.CreatePersonIn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequestMapping("/person")
public interface PersonApi {
    @PostMapping
    @ResponseStatus(CREATED)
    void create(@RequestBody @Valid CreatePersonIn createPersonIn);

}