package com.zavattaro.alimenti.service;

import java.util.List;

import com.zavattaro.alimenti.entities.Alimento;

public interface AlimentoService {
	
	void addAlimento(Alimento a);
	void deleteAlimento(Alimento a);
	void deleteAlimento(int id);
	void updateAlimento(Alimento a);
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCat(String categoria);
	Alimento getAlimento(int id);
	

}
