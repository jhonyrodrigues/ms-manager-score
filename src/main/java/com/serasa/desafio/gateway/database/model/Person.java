package com.serasa.desafio.gateway.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private String id;

    private String nome;

    private String telefone;

    private Integer idade;

    private String cidade;

    private String estado;

    private Integer score;

    private String regiao;

    private LocalDateTime dataInclusao;

}