package com.zavattaro.ricette.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ricette")
public class Ricetta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "id_Paese")
	private Paese paese;
	private String nome;
	private String ingredienti;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paese getIdPaese() {
		return paese;
	}
	public void setIdPaese(Paese idPaese) {
		this.paese = idPaese;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}
	
}
