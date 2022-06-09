package com.serasa.desafio.service;

import com.serasa.desafio.gateway.AffinityGateway;
import com.serasa.desafio.gateway.database.dto.CreateAffinityIn;
import com.serasa.desafio.gateway.database.mapper.AffinityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AffinityService {

    private final AffinityGateway affinityGateway;

    private final AffinityMapper mapper;

    public void create(CreateAffinityIn createAffinityIn) {
        affinityGateway.create(mapper.toAffinityModel(createAffinityIn));
    }

}