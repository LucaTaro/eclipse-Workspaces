package com.zavattaro.school.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.school.entities.Corso;

public interface CorsoDAO extends JpaRepository<Corso, Integer> {
	
	List<Corso> findByNomeContaining(String nome);
	List<Corso> findByCreditiLessThan(int credito);

}
