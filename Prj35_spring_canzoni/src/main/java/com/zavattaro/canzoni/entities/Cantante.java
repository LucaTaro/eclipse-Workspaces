package com.zavattaro.canzoni.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cantanti")
public class Cantante {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String nome;
	@OneToMany
	private List<Canzone> canzoni;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Canzone> getCanzoni() {
		return canzoni;
	}
	public void setCanzoni(List<Canzone> canzoni) {
		this.canzoni = canzoni;
	}

}
