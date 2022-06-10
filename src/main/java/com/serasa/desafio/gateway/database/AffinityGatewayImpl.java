package com.serasa.desafio.gateway.database;

import com.serasa.desafio.gateway.AffinityGateway;
import com.serasa.desafio.gateway.database.model.Affinity;
import com.serasa.desafio.gateway.database.repository.AffinityRepository;
import com.serasa.desafio.gateway.exception.GatewayException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class AffinityGatewayImpl implements AffinityGateway {

    private final AffinityRepository affinityRepository;

    @Override
    public void create(Affinity affinity) {
        try {
            log.info("[GATEWAY] - Create new affinity -> region: {}", affinity.getRegiao());
            affinityRepository.save(affinity);
        } catch (Exception e) {
            throw new GatewayException("[GATEWAY] - Problem to create affinity", e);
        }
    }

    @Override
    public Optional<Affinity> find(String regiao) {
        return affinityRepository.findById(regiao);
    }

}