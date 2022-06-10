package com.serasa.desafio.service;

import com.serasa.desafio.gateway.AffinityGateway;
import com.serasa.desafio.gateway.PersonGateway;
import com.serasa.desafio.gateway.ScoreGateway;
import com.serasa.desafio.gateway.database.dto.FindPersonOut;
import com.serasa.desafio.gateway.database.mapper.PersonMapper;
import com.serasa.desafio.gateway.database.model.Affinity;
import com.serasa.desafio.gateway.database.model.Person;
import com.serasa.desafio.gateway.database.model.Score;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FindPersonServiceTest {

    @InjectMocks
    private FindPersonService findPersonService;

    @Mock
    private PersonGateway personGateway;

    @Mock
    private AffinityGateway affinityGateway;

    @Mock
    private ScoreGateway scoreGateway;

    @Mock
    private PersonMapper personMapper;

    private Person person;

    private Affinity affinity;

    private Score score;

    private FindPersonOut personOut;

    @BeforeEach
    void setup() {
        startPerson();
        startAffinity();
        startScore();
        startPersonOut();
    }


    @Test
    void mustFindPersonWithIdSuccessfully() {

        when(personGateway.find(any())).thenReturn(Optional.of(person));

        when(affinityGateway.find(any())).thenReturn(Optional.of(affinity));

        when(scoreGateway.findAll()).thenReturn(List.of(score));

        when(personMapper.toFindPersonOut(any(), any(), any())).thenReturn(personOut);

        var response = findPersonService.find(person.getId());

        assertNotNull(response);
        assertEquals(response.getNome(), person.getNome());
        assertEquals(response.getTelefone(), person.getTelefone());
        assertEquals(response.getIdade(), person.getIdade());
        assertEquals(response.getScoreDescricao(), score.getDescricao());
        assertEquals(response.getEstados(), affinity.getEstado());
        assertDoesNotThrow(()-> findPersonService.find(person.getId()));

    }

    private void startPerson() {
        person = new Person("976b4eca-eadd-4e95-8a33-a4c44a099346", "Jhony", "5511999999999", 31, "Barueri", "SP", 1000, "sudeste", LocalDateTime.now());
    }

    private void startAffinity() {
        affinity = new Affinity("sudeste", List.of("SP", "RJ", "MG", "ES"));
    }

    private void startScore() {
        score = new Score("976b4eca-eadd-4e95-8a33-a4c44a099555", "Inaceitável", 0, 200);
    }

    private void startPersonOut() {
        personOut = new FindPersonOut("Jhony", "5511999999999", 31, "Inaceitável", List.of("SP", "RJ", "MG", "ES"));
    }
}