package com.serasa.desafio.gateway.database.repository;

import com.serasa.desafio.gateway.database.model.Affinity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffinityRepository extends JpaRepository<Affinity, String> {
}