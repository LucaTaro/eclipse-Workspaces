package controller;

import java.util.ArrayList;

import model.Utente;

public class UtenteCtrl {
	
	private ArrayList<Utente> utenti = new ArrayList<Utente>();
	
	{
		utenti.add(new Utente("taro", "12345"));
		utenti.add(new Utente("sara", "12345"));
		utenti.add(new Utente("morfi", "12345"));
	}

	public boolean login(String user, String passw) {
		for (Utente utente : utenti) {
			if(utente.getUsername().equals(user) && utente.getPassword().equals(passw))
				return true;
		}
		return false;
	}
}
