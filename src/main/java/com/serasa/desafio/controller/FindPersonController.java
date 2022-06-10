package com.serasa.desafio.controller;

import com.serasa.desafio.controller.api.FindPersonApi;
import com.serasa.desafio.gateway.database.dto.FindPersonOut;
import com.serasa.desafio.service.FindPersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FindPersonController implements FindPersonApi {

    private final FindPersonService findPersonService;

    @Override
    public FindPersonOut findById(String id) {
        log.info("[CONTROLLER] - Request received -> find person out");
        return findPersonService.find(id);
    }

}