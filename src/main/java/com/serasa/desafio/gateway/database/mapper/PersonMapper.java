package com.serasa.desafio.gateway.database.mapper;

import com.serasa.desafio.gateway.database.dto.CreatePersonIn;
import com.serasa.desafio.gateway.database.dto.FindPersonOut;
import com.serasa.desafio.gateway.database.model.Affinity;
import com.serasa.desafio.gateway.database.model.Person;
import com.serasa.desafio.gateway.database.model.Score;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class PersonMapper {
    public Person toPersonModel(CreatePersonIn createPersonIn) {
        return Person.builder().id(UUID.randomUUID().toString()).nome(createPersonIn.getNome()).telefone(createPersonIn.getTelefone())
                .idade(createPersonIn.getIdade()).cidade(createPersonIn.getCidade()).estado(createPersonIn.getEstado())
                .score(createPersonIn.getScore()).regiao(createPersonIn.getRegiao()).dataInclusao(LocalDateTime.now())
                .build();
    }

    public FindPersonOut toFindPersonOut(Person person, Affinity affinity, String scoreDescricao) {
        return new FindPersonOut(person.getNome(), person.getTelefone(), person.getIdade(), scoreDescricao, affinity.getEstado());
    }
}
