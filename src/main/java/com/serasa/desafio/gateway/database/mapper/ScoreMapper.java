package com.serasa.desafio.gateway.database.mapper;

import com.serasa.desafio.gateway.database.dto.CreateScoreIn;
import com.serasa.desafio.gateway.database.model.Score;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ScoreMapper {
    public Score toScoreModel(CreateScoreIn createScoreIn) {
        return Score.builder().id(UUID.randomUUID().toString()).descricao(createScoreIn.getDescricao())
                .faixaInicial(createScoreIn.getFaixaInicial()).faixaFinal(createScoreIn.getFaixaFinal())
                .build();
    }
}