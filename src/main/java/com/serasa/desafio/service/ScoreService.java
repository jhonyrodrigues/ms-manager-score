package com.serasa.desafio.service;

import com.serasa.desafio.gateway.ScoreGateway;
import com.serasa.desafio.gateway.database.dto.CreateScoreIn;
import com.serasa.desafio.gateway.database.mapper.ScoreMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreService {

    private final ScoreGateway scoreGateway;

    private final ScoreMapper mapper;

    public void create(CreateScoreIn createScoreIn) {
        scoreGateway.create(mapper.toScoreModel(createScoreIn));
    }

}