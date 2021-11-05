package controller;

import java.util.ArrayList;

import model.Gatto;

public class DBGatti {

	private ArrayList<Gatto> gatti = new ArrayList<Gatto>();
	
	{
		gatti.add(new Gatto("Asia", "asia.jpg", 5000));
		gatti.add(new Gatto("Massimino", "max.jpg", 15000));
		gatti.add(new Gatto("Eevee", "eevee.jpg", 2500));
	}
	
	public ArrayList<Gatto> getGatti() {
		return gatti;
	}
}
