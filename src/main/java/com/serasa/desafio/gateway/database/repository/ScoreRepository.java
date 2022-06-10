package com.serasa.desafio.gateway.database.repository;

import com.serasa.desafio.gateway.database.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, String> {
}