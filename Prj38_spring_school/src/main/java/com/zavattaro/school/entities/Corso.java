package com.zavattaro.school.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "corsi")
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private int crediti;	
	
	@ManyToMany(mappedBy = "corsi", fetch = FetchType.LAZY)
	@JsonIgnoreProperties("corsi")
	private Set<Studente> studenti = new HashSet<>();
	
	public Corso() {

	}

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

	public int getCrediti() {
		return crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}

	
	public Set<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(Set<Studente> studenti) {
		this.studenti = studenti;
	}

	@Override
	public String toString() {
		return "Corso [id=" + id + ", nome=" + nome + ", crediti=" + crediti + ", studenti=" + studenti + "]";
	}

	public Corso(String nome, int crediti) {
		this.nome = nome;
		this.crediti = crediti;
	}
	
}
