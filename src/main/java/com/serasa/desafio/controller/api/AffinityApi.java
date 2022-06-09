package com.serasa.desafio.controller.api;

import com.serasa.desafio.gateway.database.dto.CreateAffinityIn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequestMapping("/affinity")
public interface AffinityApi {

    @PostMapping
    @ResponseStatus(CREATED)
    void create(@RequestBody @Valid CreateAffinityIn createAffinityIn);

}