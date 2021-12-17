package com.zavattaro.school.services;

import java.util.List;

import com.zavattaro.school.entities.Studente;

public interface StudenteService {
	
	List<Studente> getAll();
	Studente getOne(int id);
}
