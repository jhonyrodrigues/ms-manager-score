package com.serasa.desafio.gateway.database.repository;

import com.serasa.desafio.gateway.database.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
}
