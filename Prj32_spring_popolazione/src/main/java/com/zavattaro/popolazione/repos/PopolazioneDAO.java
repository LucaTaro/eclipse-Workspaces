package com.zavattaro.popolazione.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.popolazione.entites.Popolazione;

public interface PopolazioneDAO extends JpaRepository<Popolazione, Integer> {
	
	List<Popolazione> findByRegione(String regione);
	List<Popolazione> findByComune(String comune);

}
