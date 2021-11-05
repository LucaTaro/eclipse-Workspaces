package model;

public class Impiegato extends Dipendente {

	private int oreLavorate;
	
	public Impiegato(String nome) {
		super(nome);
	}

	public int getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate;
	}
	
	public double calcolaPaga() {
		return oreLavorate * 7.5;
	}

}
