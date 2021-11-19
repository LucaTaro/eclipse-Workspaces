package model;

import java.util.ArrayList;

public class Sacco {

	private ArrayList<DonoRicevente> doni;
	private String nome;
	
	

	public Sacco(ArrayList<DonoRicevente> doni, String nome) {
		super();
		this.doni = doni;
		this.nome = nome;
	}

	public ArrayList<DonoRicevente> getDoni() {
		return doni;
	}

	public void setDoni(ArrayList<DonoRicevente> doni) {
		this.doni = doni;
	}
	
	
}
