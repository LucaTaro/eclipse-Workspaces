package com.zavattaro.ricette.sl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.ricette.dal.RicettaDAO;
import com.zavattaro.ricette.entities.Ricetta;

@Service
public class RicettaServiceImpl implements RicetteService {

	@Autowired
	private RicettaDAO repo;
	
	@Override
	public List<Ricetta> getAll() {
		return this.repo.findAll();
	}

	@Override
	public void addRicetta(Ricetta r) {
		this.repo.save(r);
	}

}
