package com.serasa.desafio.controller.api;

import com.serasa.desafio.gateway.database.dto.FindPersonOut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/person")
public interface FindPersonApi {

    @GetMapping("/{id}")
    FindPersonOut findById(@PathVariable String id);

}