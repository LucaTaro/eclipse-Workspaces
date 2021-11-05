package controller;

import java.util.ArrayList;

import model.Articolo;

public class GestioneArticolo {
	
	private ArrayList<Articolo> articoli;
	
	public GestioneArticolo() {
		this.articoli = new ArrayList<Articolo>();
	}

	public void addArticolo(String nome, double prezzoAlChilo, double peso) {
		this.articoli.add(new Articolo (nome, prezzoAlChilo, peso));
	}

	public ArrayList<Articolo> getArticoli() {
		return articoli;
	}
	
	public void stampaScontrino() {
		double totale = 0;
		int puntiFedelta = 0;
		for (Articolo articolo : articoli) {
			System.out.print("Articolo ");
			System.out.println(articolo.getNome());
			System.out.println("Peso " + articolo.getPeso() + "kg");
			System.out.println("Prezzo " + articolo.getPrezzoAlChilo() + "€");
			double temp = articolo.calcolaPrezzo();
			totale += temp;
			puntiFedelta += articolo.puntiFedelta();
		}
		System.out.println("\nIl totale è: " + totale);
		System.out.println("In punti fedeltà accumulati sono: " + puntiFedelta);
	}
	
}
	