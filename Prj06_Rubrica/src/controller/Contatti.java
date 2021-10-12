package controller;

import model.Contatto;

public class Contatti {

	Contatto[] schedario;
	
	public Contatti(int numCont) {//costruttore dell'array schedario
		schedario = new Contatto[numCont];
		
	}
	
	public void addContatto(String name, String num, int posizione) {
		Contatto n = new Contatto(name, num);
		schedario[posizione] = n;
		System.out.println();
		System.out.println("Contatto aggiunto");
	}
	
	public void stampaTutto() {//metodo stampare la rubrica
		System.out.println("Lista contatti");
		System.out.println();
		
		for (int i = 0; i < schedario.length; i++) {
			if(schedario[i] != null) {
				System.out.println(schedario[i].stampa());
			} 
			System.out.println("Vuoto");
		}
	}
	
	public void stampaUno(int i) {
		System.out.println("Contatto selezionato");
		System.out.println();
		System.out.println(schedario[i].stampa());
	}
	
}
