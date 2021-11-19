package model;

import java.util.ArrayList;

import dao.BabboDAOImpl;
import dao.DonoDAOImpl;
import dao.RiceventeDAOImpl;

public class SuperBabbo extends Babbo{

	private ArrayList<Babbo> listaBabbi;
	private ArrayList<Dono> listaDoni;
	private ArrayList<Ricevente> listaRiceventi;

	private RiceventeDAOImpl rdao = new RiceventeDAOImpl();
	private DonoDAOImpl donodao = new DonoDAOImpl();
	private BabboDAOImpl bdao = new BabboDAOImpl();
	
	public SuperBabbo() {
		this.listaBabbi = popolaBabbi();
		this.listaDoni = popolaDoni();
		this.listaRiceventi = popolaRiceventi();
	}

	public ArrayList<Dono> popolaDoni() {
		for(Dono d : donodao.getDoni()) {
			listaDoni.add(d);
		}
		return listaDoni;
	}
	
	public ArrayList<Ricevente> popolaRiceventi() {
		for(Ricevente r : rdao.getRiceventi()) {
			listaRiceventi.add(r);
		}
		return listaRiceventi;
	}
	
	public ArrayList<Babbo> popolaBabbi() {
		for(Babbo b : bdao.getBabbi()) {
			listaBabbi.add(b);
		}
		return listaBabbi;
	}

}