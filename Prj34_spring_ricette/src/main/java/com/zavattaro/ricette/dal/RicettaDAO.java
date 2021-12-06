package com.zavattaro.ricette.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.ricette.entities.Ricetta;

public interface RicettaDAO extends JpaRepository<Ricetta, Integer> {

}
