package com.serasa.desafio.service;

import com.serasa.desafio.gateway.PersonGateway;
import com.serasa.desafio.gateway.database.dto.CreatePersonIn;
import com.serasa.desafio.gateway.database.mapper.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonGateway personGateway;

    private final PersonMapper mapper;

    public void create(CreatePersonIn createPersonIn) {
        personGateway.create(mapper.toPersonModel(createPersonIn));
    }

}