package com.zavattaro.popolazioneMauro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.popolazioneMauro.dal.ProvinciaDAO;
import com.zavattaro.popolazioneMauro.entites.Provincia;

@Service
public class ProvinciaServiceImpls implements ProvinciaService {

	@Autowired
	private ProvinciaDAO repo;
	
	private List<Provincia> province;
	
	public void initProvince() {
		if(this.province.isEmpty() || this.province == null) 
			this.province = this.getAll();
	}
	
	public List<Provincia> getProvince() {
		return this.province;
	}
	
	@Override
	public Provincia getProvincia(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public List<Provincia> getAll() {
		return this.repo.findAll();
	}

	@Override
	public List<Provincia> getByRegione(String regione) {
		return this.repo.findByRegione(regione);
	}

	@Override
	public void addProvincia(Provincia p) {
		this.repo.save(p);		
	}

}
