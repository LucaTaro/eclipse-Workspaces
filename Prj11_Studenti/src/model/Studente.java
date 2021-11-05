package model;

public class Studente {
	
	private int id;
	private String nome;
	private String cognome;
	private int eta;
	
	public Studente(String nome, String cognome) {
		this.id = 1;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = 25;
	}

	public String getCognome() {
		return this.cognome;
	}


}
