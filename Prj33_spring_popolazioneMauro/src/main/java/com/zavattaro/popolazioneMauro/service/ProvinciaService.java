package com.zavattaro.popolazioneMauro.service;

import java.util.List;

import com.zavattaro.popolazioneMauro.entites.Provincia;

public interface ProvinciaService {
	
	void addProvincia(Provincia p);
	Provincia getProvincia(int id);
	List<Provincia> getAll();
	List<Provincia> getByRegione(String regione);
	List<Provincia> getProvince();
	void initProvince();

}
