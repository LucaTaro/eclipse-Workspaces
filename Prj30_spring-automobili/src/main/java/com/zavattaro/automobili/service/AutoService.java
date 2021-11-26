package com.zavattaro.automobili.service;

import java.util.List;

import com.zavattaro.automobili.entities.Automobile;

public interface AutoService {

	void addAuto(Automobile a);
	Automobile getAutomobile(int id);
	List<Automobile> getAllAuto();
	List<Automobile> getAllAutoByMarca(String marca);
	
}
