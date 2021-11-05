package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Pizza;

public class GestionalePizza {
	
	private ArrayList<Pizza> pizze;

	public GestionalePizza() {
		this.pizze = new ArrayList<Pizza>();
	}
	
	public void initMenu (String nomeFile) {
		File elenco = new File(nomeFile);
		this.pizze.clear();
		try {
			Scanner sc = new Scanner(elenco);
			while (sc.hasNextLine()) {
				String[] p = sc.nextLine().split(", ");
				double prezzo = Double.parseDouble(p[1]);
				ArrayList<String> ingredienti = new ArrayList<>();
				ingredienti.add("Pomodoro");
				ingredienti.add("Mozzarella");
				ingredienti.add(p[0]);
				//costruisco la pizza
				Pizza pizza = new Pizza(p[0], prezzo, ingredienti, p[3]);
				//aggiungo la pizza nel contenitore
				this.pizze.add(pizza);				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public ArrayList<Pizza> getPizze() {
		return pizze;
	}

}
