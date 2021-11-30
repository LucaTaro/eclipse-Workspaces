package com.zavattaro.popolazione.service;

import java.util.List;

import com.zavattaro.popolazione.entites.Popolazione;

public interface PopolazioneService {

	List<Popolazione> getPopolazione();
	List<Popolazione> getPopolazioneByRegione(String regione);
	List<Popolazione> getPopolazioneByComune(String comune);

	
}
