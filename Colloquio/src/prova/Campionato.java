package prova;

import java.util.ArrayList;
import java.util.List;

public class Campionato {
	
	private String serie;
	List<Squadra> squadre = new ArrayList<Squadra>();
	
	
	public Campionato(String serie) {
		super();
		this.serie = serie;
	}
	
	public void aggiungiSquadra(Squadra squadra) {
		squadre.add(squadra);
	}

	public void simulaPartita() {
		int squadra1 = (int) Math.floor(Math.random() * squadre.size());
		int squadra2 = (int) Math.floor(Math.random() * squadre.size());
		
		Squadra s1 = squadre.get(squadra1);
		Squadra s2 = squadre.get(squadra2);
		
		
		
	}
}
