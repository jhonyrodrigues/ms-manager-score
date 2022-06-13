package com.serasa.desafio.gateway.database.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Profile implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String nome;

    @Override
    public String getAuthority() {
        return this.nome;
    }

}