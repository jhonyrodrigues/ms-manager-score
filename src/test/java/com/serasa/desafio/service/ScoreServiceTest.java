package com.serasa.desafio.service;

import com.serasa.desafio.gateway.ScoreGateway;
import com.serasa.desafio.gateway.database.dto.CreateScoreIn;
import com.serasa.desafio.gateway.database.mapper.ScoreMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ScoreServiceTest {

    @InjectMocks
    private ScoreService scoreService;

    @Mock
    private ScoreGateway scoreGateway;

    @Mock
    private ScoreMapper scoreMapper;

    private CreateScoreIn createScoreIn;



    @BeforeEach
    void setup() {
        startScore();
    }

    @Test
    void mustRegisterNewScoreSuccessfully() {

        assertDoesNotThrow(()-> scoreService.create(createScoreIn));

    }

    private void startScore() {
        createScoreIn = new CreateScoreIn("Inaceitável" ,0, 200);
    }
}