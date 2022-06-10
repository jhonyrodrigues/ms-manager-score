package com.serasa.desafio.gateway;

import com.serasa.desafio.gateway.database.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonGateway {

    void create(Person person);

    Optional<Person> find(String id);

    List<Person> findAll();

}