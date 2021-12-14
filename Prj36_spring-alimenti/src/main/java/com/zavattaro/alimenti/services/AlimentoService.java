package com.zavattaro.alimenti.services;

import java.util.List;
import java.util.Optional;

import com.zavattaro.alimenti.entities.Alimento;

public interface AlimentoService {
	
	//C: ti passo un alimento da aggiungere al DB
	void addAlimento(Alimento a);
	//R: passo un id e restituisco un alimento
	Optional<Alimento> getAlimentoById(int id);
	List<Alimento> getAll();
	List<Alimento> getAllByCategoria(String categoria);
	//U: passo un alimento da aggiornare sul db
	Alimento updAlimento(Alimento a);
	//D: passo un alimento e lo cancello dal db
	void deleteAlimentoById(int id);
}
