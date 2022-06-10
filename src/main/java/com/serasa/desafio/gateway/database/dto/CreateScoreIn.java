package com.serasa.desafio.gateway.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateScoreIn {

    private String descricao;

    @Min(0)
    private Integer faixaInicial;

    @Max(1000)
    private Integer faixaFinal;

}