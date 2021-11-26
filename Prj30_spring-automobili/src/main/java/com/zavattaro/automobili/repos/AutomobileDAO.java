package com.zavattaro.automobili.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.automobili.entities.Automobile;

public interface AutomobileDAO extends JpaRepository<Automobile, Integer> {
	
	List<Automobile> findByMarca(String marca);

}
