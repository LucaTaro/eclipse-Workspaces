package com.zavattaro.ricette.sl;

import java.util.List;

import com.zavattaro.ricette.entities.Ricetta;

public interface RicetteService {
	
	List<Ricetta> getAll();
	void addRicetta(Ricetta r);
	

}
