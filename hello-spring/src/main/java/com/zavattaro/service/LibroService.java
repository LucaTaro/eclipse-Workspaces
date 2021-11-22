package com.zavattaro.service;

import java.util.ArrayList;

import com.zavattaro.model.Libro;

public class LibroService {
	private ArrayList<Libro> libri;
	
	public LibroService() {
		this.libri  = new ArrayList<Libro>();
		libri.add(new Libro(0, "Ah."));
		libri.add(new Libro(1, "Wof wof"));
		libri.add(new Libro(1, "Miao miao"));
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}
	

}
