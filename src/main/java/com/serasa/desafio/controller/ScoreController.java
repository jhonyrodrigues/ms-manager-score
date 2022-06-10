package com.serasa.desafio.controller;

import com.serasa.desafio.controller.api.ScoreApi;
import com.serasa.desafio.gateway.database.dto.CreateScoreIn;
import com.serasa.desafio.service.ScoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ScoreController implements ScoreApi {

    private final ScoreService scoreService;

    @Override
    public void create(CreateScoreIn createScoreIn) {
        log.info("[CONTROLLER] - Request received -> create score in");
        scoreService.create(createScoreIn);
    }

}