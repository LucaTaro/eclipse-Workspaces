package com.zavattaro.school.entities;

import java.util.HashSet;
import java.util.Set;

public class Studente {

	private int id;
	private String nome;
	private int eta;
	
	Set<Corso> corsi = new HashSet<>();
}
