package com.serasa.desafio.controller.api;

import com.serasa.desafio.gateway.database.dto.CreateScoreIn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequestMapping("/score")
public interface ScoreApi {

    @PostMapping
    @ResponseStatus(CREATED)
    void create(@RequestBody @Valid CreateScoreIn createScoreIn);

}
