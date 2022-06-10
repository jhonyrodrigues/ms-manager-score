package com.serasa.desafio.gateway.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Score {

    @Id
    private String id;

    private String descricao;

    private Integer faixaInicial;

    private Integer faixaFinal;

}