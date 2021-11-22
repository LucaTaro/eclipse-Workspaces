package com.zavattaro.model;

public class Libro {
	private int id;
	private String titolo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public Libro(int id, String titolo) {
		super();
		this.id = id;
		this.titolo = titolo;
	}
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + "]";
	}
	
}
