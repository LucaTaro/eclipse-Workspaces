package controller;

import java.util.ArrayList;
import java.util.Random;

import database.DB;
import model.Studente;

public class Studenti {
	
	private ArrayList<Studente> registro;
	
	public Studenti() {
		this.registro = new ArrayList<>();
		this.init();
	}
	
	private void init() {
		for (String[] riga : DB.ELENCO) {
			Studente s = new Studente(riga[0], riga[1]);
			this.registro.add(s);
		}
	}
	
	public Studente sorteggiaStudente() {
		Random r = new Random();
		return this.registro.get(r.nextInt(registro.size()));
	}
}
