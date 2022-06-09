package com.serasa.desafio.controller;

import com.serasa.desafio.controller.api.AffinityApi;
import com.serasa.desafio.gateway.database.dto.CreateAffinityIn;
import com.serasa.desafio.service.AffinityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AffinityController implements AffinityApi {

    private final AffinityService affinityService;

    @Override
    public void create(CreateAffinityIn createAffinityIn) {
        log.info("[CONTROLLER] - Request received -> create affinity in");
        affinityService.create(createAffinityIn);
    }

}