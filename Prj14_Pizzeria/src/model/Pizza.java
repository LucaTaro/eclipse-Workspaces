package model;

import java.util.ArrayList;

public class Pizza {
	
	private String nome;
	private double prezzo;
	private ArrayList<String> ingredienti;
	private String formato;
	
	public Pizza(String nome, double prezzo, ArrayList<String> ingredienti, String formato) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		this.formato = formato;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public ArrayList<String> getIngredienti() {
		return ingredienti;
	}

	public String getFormato() {
		return formato;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Pizza " + nome);
		sb.append("\n");
		sb.append("Costa " + prezzo + "€");
		sb.append("\n");
		sb.append("Ha i seguenti ingredienti: ");
		for (String ing : ingredienti) {
			sb.append(ing + " - " );
		}
		return sb.toString();
	}
	
	
}
