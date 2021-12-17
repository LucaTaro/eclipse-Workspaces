package com.zavattaro.school.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "studenti_java")
public class Studente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private int eta;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "studenti_corsi", 
		joinColumns = {
				@JoinColumn(name = "studente_id",
						referencedColumnName = "id",
						nullable = false,
						updatable = false)
		},
		inverseJoinColumns = {
				@JoinColumn(name = "corso_id",
						referencedColumnName = "id",
						nullable = false,
						updatable = false)
		}
			)
	@JsonIgnoreProperties("studenti")
	private Set<Corso> corsi = new HashSet<>();

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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Set<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(Set<Corso> corsi) {
		this.corsi = corsi;
	}

	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	public Studente() {
		
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", eta=" + eta + ", corsi=" + corsi + "]";
	}
	
}
