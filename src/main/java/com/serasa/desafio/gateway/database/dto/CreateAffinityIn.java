package com.serasa.desafio.gateway.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAffinityIn {

    private String regiao;

    private List<String> estados;

}