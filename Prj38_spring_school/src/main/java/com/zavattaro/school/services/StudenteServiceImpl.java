package com.zavattaro.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.school.dal.StudenteDAO;
import com.zavattaro.school.entities.Studente;

@Service
class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	private StudenteDAO repo;

	@Override
	public List<Studente> getAll() {
		return repo.findAll();
	}

	@Override
	public Studente getOne(int id) {
		return repo.findById(id).get();
	}

}
