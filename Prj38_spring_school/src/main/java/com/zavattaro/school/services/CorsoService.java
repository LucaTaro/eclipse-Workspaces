package com.zavattaro.school.services;

import java.util.List;

import com.zavattaro.school.dal.CorsoDAO;
import com.zavattaro.school.entities.Corso;

public interface CorsoService {
	
	List<Corso> getAll();

}
