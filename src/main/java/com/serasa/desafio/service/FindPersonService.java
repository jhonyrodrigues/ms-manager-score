package com.serasa.desafio.service;

import com.serasa.desafio.service.exception.NotContentException;
import com.serasa.desafio.gateway.AffinityGateway;
import com.serasa.desafio.gateway.PersonGateway;
import com.serasa.desafio.gateway.ScoreGateway;
import com.serasa.desafio.gateway.database.dto.FindPersonOut;
import com.serasa.desafio.gateway.database.mapper.PersonMapper;
import com.serasa.desafio.gateway.database.model.Score;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindPersonService {

    private final PersonGateway personGateway;

    private final AffinityGateway affinityGateway;

    private final ScoreGateway scoreGateway;

    private final PersonMapper findPersonMapper;

    public FindPersonOut find(String id) {

        var person = personGateway.find(id)
                .orElseThrow(NotContentException::new);

        var affinity = affinityGateway.find(person.getRegiao())
                .orElseThrow(NotContentException::new);

        var score = scoreGateway.findAll();

        return findPersonMapper.toFindPersonOut(person, affinity, filterScore(score, person.getScore()));

    }

    private String filterScore(List<Score> score, Integer personScore) {
        String value = "";
        for (Score s : score) {
            if (s.getFaixaInicial() <= personScore || s.getFaixaFinal() <= personScore) {
                value = s.getDescricao();
            }
        }
        return value;
    }

}