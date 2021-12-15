package com.zavattaro.canzoni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.canzoni.dal.CanzoneDAO;
import com.zavattaro.canzoni.entities.Canzone;

@Service
public class CanzoniServiceImpls implements CanzoneService {

	@Autowired
	private CanzoneDAO repo;

	@Override
	public Canzone getCanzoni(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCanzone(Canzone c) {
		this.repo.save(c);
		
	}
	
	

}
