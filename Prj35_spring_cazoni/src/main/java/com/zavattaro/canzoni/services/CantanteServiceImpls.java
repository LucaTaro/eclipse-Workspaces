package com.zavattaro.canzoni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.canzoni.dal.CantanteDAO;
import com.zavattaro.canzoni.entities.Cantante;

@Service
public class CantanteServiceImpls implements CantanteService {

	@Autowired
	private CantanteDAO repo;
	
	@Override
	public Cantante getCantante(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cantante> getCantanti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCantante(Cantante c) {
		this.repo.save(c);

	}

}
