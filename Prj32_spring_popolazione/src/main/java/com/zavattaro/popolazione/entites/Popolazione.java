package com.zavattaro.popolazione.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "popolazione_italiana_regione")
public class Popolazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String regione, comune, maschi, femmine, totale;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getMaschi() {
		return maschi;
	}
	public void setMaschi(String maschi) {
		this.maschi = maschi;
	}
	public String getFemmine() {
		return femmine;
	}
	public void setFemmine(String femmine) {
		this.femmine = femmine;
	}
	public String getTotale() {
		return totale;
	}
	public void setTotale(String totale) {
		this.totale = totale;
	}
	
}
