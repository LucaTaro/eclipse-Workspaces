package controller;

import database.DB;
import model.Studente;

public class StudenteCtrl {
	
	private Studente[] registro;
	
	public StudenteCtrl () {
		this.registro = new Studente[DB.studenti.length];//inizializza la lunghezza
		this.inizializza();//richiama il metodo inizializza e riempe il registro con gli studente nella classe DB
	}
	
	private void inizializza() {
		int i = 0;
		for (String[] riga : DB.studenti) {
			/*String nome = riga[0];
			String cognome = riga[1];*/
			this.registro[i] = new Studente(riga[0], riga[1]);
			i++;
		}
		
	}
	
	public Studente[] getRegistro() {//ho bisogno del getregistro poichè registro è privato, quindi vedi il registro ma non puoi scriverci o modificarlo
		return this.registro;
	}

}
