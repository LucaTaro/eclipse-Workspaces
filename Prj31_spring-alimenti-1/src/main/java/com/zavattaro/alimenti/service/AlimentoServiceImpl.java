package com.zavattaro.alimenti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.alimenti.entities.Alimento;
import com.zavattaro.alimenti.repos.AlimentoDAO;

@Service
public class AlimentoServiceImpl implements AlimentoService {
	
	@Autowired
	private AlimentoDAO repo;

	@Override
	public void addAlimento(Alimento a) {
		this.repo.save(a);

	}

	@Override
	public void deleteAlimento(Alimento a) {
		this.repo.deleteById(a.getId());

	}

	@Override
	public void deleteAlimento(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public void updateAlimento(Alimento a) {
		this.repo.save(a);
	}

	@Override
	public List<Alimento> getAlimenti() {
		return this.repo.findAll();
	}

	@Override
	public List<Alimento> getAlimentiByCat(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alimento getAlimento(int id) {
		return this.repo.findById(id).get();
	}

}
