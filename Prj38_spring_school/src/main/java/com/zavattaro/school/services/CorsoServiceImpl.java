package com.zavattaro.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.school.dal.CorsoDAO;
import com.zavattaro.school.entities.Corso;

@Service
public class CorsoServiceImpl implements CorsoService {

	@Autowired
	private CorsoDAO repo;
	
	@Override
	public List<Corso> getAll() {
		return repo.findAll();
	}


}
