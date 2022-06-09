package com.serasa.desafio.gateway;

import com.serasa.desafio.gateway.database.model.Person;

public interface PersonGateway {

    void create(Person person);

}