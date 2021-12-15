package com.zavattaro.canzoni.services;

import java.util.List;

import com.zavattaro.canzoni.entities.Cantante;

public interface CantanteService {
	
	Cantante getCantante(int id);
	List<Cantante> getCantanti();
	
	List<Cantante> getCantantiStartingFor(String prefix);
	List<Cantante> getCantantiContatining(String prefix);
	
	void addCantante(Cantante c);

}
