package com.serasa.desafio.service;

import com.serasa.desafio.gateway.AffinityGateway;
import com.serasa.desafio.gateway.database.dto.CreateAffinityIn;
import com.serasa.desafio.gateway.database.mapper.AffinityMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class AffinityServiceTest {

    @InjectMocks
    private AffinityService affinityService;

    @Mock
    private AffinityGateway affinityGateway;

    @Mock
    private AffinityMapper affinityMapper;

    private CreateAffinityIn createAffinityIn;

    @BeforeEach
    void setup() {
        startRegion();
    }

    @Test
    void mustRegisterNewRegionSuccessfully() {
        assertDoesNotThrow(() -> affinityService.create(createAffinityIn));
    }

    private void startRegion() {
        createAffinityIn = new CreateAffinityIn("sudeste", List.of("SP", "RJ", "MG", "ES"));
    }
}