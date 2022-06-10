package com.serasa.desafio.gateway.database;

import com.serasa.desafio.gateway.database.model.Person;
import com.serasa.desafio.gateway.database.repository.PersonRepository;
import com.serasa.desafio.gateway.PersonGateway;
import com.serasa.desafio.gateway.exception.GatewayException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
@RequiredArgsConstructor
public class PersonGatewayImpl implements PersonGateway {

    private final PersonRepository personRepository;

    @Override
    public void create(Person person) {
        try {
            log.info("[GATEWAY] - Create new person -> id: {}", person.getId());
            personRepository.save(person);
        } catch (Exception e) {
            throw new GatewayException("[GATEWAY] - Problem to create person", e);
        }
    }

    @Override
    public Optional<Person> find(String id) {
        return personRepository.findById(id);
    }

}