package com.serasa.desafio.gateway.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePersonIn {

    private String nome;

    private String telefone;

    private Integer idade;

    private String cidade;

    private String estado;

    @Min(0)
    @Max(1000)
    private Integer score;

    private String regiao;

}