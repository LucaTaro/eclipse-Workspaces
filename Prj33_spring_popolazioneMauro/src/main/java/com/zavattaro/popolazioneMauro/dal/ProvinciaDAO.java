package com.zavattaro.popolazioneMauro.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zavattaro.popolazioneMauro.entites.Provincia;

@Repository
public interface ProvinciaDAO extends JpaRepository<Provincia, Integer> {
	
	List<Provincia> findByRegione(String regione);

}
