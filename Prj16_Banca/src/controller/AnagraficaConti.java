package controller;

import java.util.ArrayList;

import model.ContoCorrente;
import model.Movimento;

public class AnagraficaConti {
	
	private static ArrayList<ContoCorrente> conti = new ArrayList<ContoCorrente>();
	
	public static void addConto(ContoCorrente cc) {
		conti.add(cc);
		System.out.println("Conto aggiunto");
	}
	
	public void operazioneConto(int numConto, Movimento m) {
		for (ContoCorrente contoCorrente : conti) {
			if (contoCorrente.getNumeroConto() == numConto) {
				contoCorrente.addMovimento(m);
			} else {
				System.out.println("Conto non trovato");
			}
		}
	}
	
	public static ArrayList<ContoCorrente> getConti() {
		return conti;
	}

}
