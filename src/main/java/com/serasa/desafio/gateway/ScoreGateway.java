package com.serasa.desafio.gateway;

import com.serasa.desafio.gateway.database.model.Score;

import java.util.List;

public interface ScoreGateway {

    void create(Score score);

    List<Score> findAll();

}