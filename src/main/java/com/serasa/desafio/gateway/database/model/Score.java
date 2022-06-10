package com.serasa.desafio.gateway.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    @Id
    private String id;

    private String descricao;

    private Integer faixaInicial;

    private Integer faixaFinal;

}