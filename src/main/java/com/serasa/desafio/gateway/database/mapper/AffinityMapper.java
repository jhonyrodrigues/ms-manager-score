package com.serasa.desafio.gateway.database.mapper;

import com.serasa.desafio.gateway.database.dto.CreateAffinityIn;
import com.serasa.desafio.gateway.database.model.Affinity;
import org.springframework.stereotype.Component;

@Component
public class AffinityMapper {
    public Affinity toAffinityModel(CreateAffinityIn createAffinityIn) {
        return Affinity.builder().regiao(createAffinityIn.getRegiao()).estado(createAffinityIn.getEstados()).build();
    }
}