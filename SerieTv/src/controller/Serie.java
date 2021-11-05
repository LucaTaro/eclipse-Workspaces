package controller;

import java.util.ArrayList;

import model.SerieTv;

public class Serie {
	
	ArrayList<SerieTv> elenco;
	
	public Serie() {
		this.elenco = new ArrayList<>();
	}
	
	public void addSerie(String nomeSerie, boolean vista) {
		this.elenco.add(new SerieTv(nomeSerie, vista));
	}
	
	public void stampaElenco() {
		for (SerieTv serieTv : elenco) {
			System.out.println(serieTv);
		}
	}

}
