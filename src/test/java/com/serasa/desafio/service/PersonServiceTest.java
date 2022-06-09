package com.serasa.desafio.service;

import com.serasa.desafio.gateway.PersonGateway;
import com.serasa.desafio.gateway.database.dto.CreatePersonIn;
import com.serasa.desafio.gateway.database.mapper.PersonMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @InjectMocks
    private PersonService personService;

    @Mock
    private PersonGateway personGateway;

    @Mock
    private PersonMapper mapper;

    CreatePersonIn createPersonIn;

    @BeforeEach
    public void setup(){
        startPerson();
    }

    @Test
    void mustRegisterNewPersonSuccessfully() {

        assertDoesNotThrow(()-> personService.create(createPersonIn));

    }

    private void startPerson() {
        createPersonIn = new CreatePersonIn("Jhony", "5511999999999", 31, "Barueri", "SP", 1000, "sudeste");
    }
}