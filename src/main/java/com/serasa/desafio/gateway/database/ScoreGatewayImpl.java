package com.serasa.desafio.gateway.database;

import com.serasa.desafio.gateway.ScoreGateway;
import com.serasa.desafio.gateway.database.model.Score;
import com.serasa.desafio.gateway.database.repository.ScoreRepository;
import com.serasa.desafio.gateway.exception.GatewayException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ScoreGatewayImpl implements ScoreGateway {

    private final ScoreRepository scoreRepository;

    @Override
    public void create(Score score) {
        try {
            log.info("[GATEWAY] - Create new score -> id: {}", score.getId());
            scoreRepository.save(score);
        } catch (Exception e) {
            throw new GatewayException("[GATEWAY] - Problem to create score", e);
        }
    }

}