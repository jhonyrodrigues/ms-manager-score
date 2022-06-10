package com.serasa.desafio.gateway;

import com.serasa.desafio.gateway.database.model.Affinity;

import java.util.Optional;

public interface AffinityGateway {

    void create(Affinity affinity);

    Optional<Affinity> find(String regiao);

}