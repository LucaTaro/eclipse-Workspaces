package database;

import java.util.ArrayList;

import model.Panino;
import model.Prodotto;

public class Prodotti {
	
	public static ArrayList<Prodotto> DB = new ArrayList<Prodotto>();
	
	static {
		DB.add(new Panino("Hamburger", 3.5));
		DB.add(new Panino("Chessburger", 4.5));
		DB.add(new Panino("Fishburger", 5.5));
	}
	
	public static Prodotto getProdottoByName(String name) {
		for (Prodotto prodotto : DB) {
			if(prodotto.getNome().equals(name))
				return prodotto;
		}
		return null;
	}

}
