package com.zavattaro.popolazione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavattaro.popolazione.entites.Popolazione;
import com.zavattaro.popolazione.repos.PopolazioneDAO;

@Service
public class PopolazioneServiceImpl implements PopolazioneService {
	
	@Autowired
	private PopolazioneDAO repo;

	@Override
	public List<Popolazione> getPopolazione() {
		return this.repo.findAll();
	}

	@Override
	public List<Popolazione> getPopolazioneByRegione(String regione) {
		// TODO Auto-generated method stub
		return this.repo.findByRegione(regione);
	}

	@Override
	public List<Popolazione> getPopolazioneByComune(String comune) {
		return this.repo.findByComune(comune);
	}


}
