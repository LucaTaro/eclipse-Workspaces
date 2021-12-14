package com.zavattaro.alimenti.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.alimenti.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

}
