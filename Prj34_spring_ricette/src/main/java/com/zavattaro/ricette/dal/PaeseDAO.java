package com.zavattaro.ricette.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.ricette.entities.Paese;

public interface PaeseDAO extends JpaRepository<Paese, Integer> {

}
