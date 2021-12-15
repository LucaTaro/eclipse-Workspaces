package com.zavattaro.canzoni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.canzoni.entities.Canzone;

public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {

}
