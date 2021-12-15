package com.zavattaro.canzoni.services;

import java.util.List;

import com.zavattaro.canzoni.entities.Canzone;

public interface CanzoneService {
	
	Canzone getCanzoni(int id);
	List<Canzone> getCanzone();
	
	void addCanzone(Canzone c);

}
