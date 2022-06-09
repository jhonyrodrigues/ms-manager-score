package com.serasa.desafio.controller;

import com.serasa.desafio.gateway.database.dto.CreatePersonIn;
import com.serasa.desafio.service.PersonService;
import com.serasa.desafio.controller.api.PersonApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PersonController implements PersonApi {

    private final PersonService personService;

    @Override
    public void create(CreatePersonIn createPersonIn) {
        log.info("[CONTROLLER] - Request received -> create person in");
        personService.create(createPersonIn);
    }

}