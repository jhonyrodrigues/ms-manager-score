package com.serasa.desafio.gateway.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindPersonOut {

    private String nome;

    private String telefone;

    private Integer idade;

    private String scoreDescricao;

    private List<String> estados;

}