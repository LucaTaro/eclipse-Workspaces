package com.zavattaro.canzoni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.canzoni.entities.Cantante;

public interface CantanteDAO extends JpaRepository<Cantante, Integer> {

}
