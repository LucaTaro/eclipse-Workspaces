package com.zavattaro.school.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zavattaro.school.entities.Studente;

public interface StudenteDAO extends JpaRepository<Studente, Integer> {

	List<Studente> findByNomeContaining(String nome);
}
