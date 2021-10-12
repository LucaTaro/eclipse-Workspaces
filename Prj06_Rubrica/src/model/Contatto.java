package model;

public class Contatto {
	
	public String nome;
	public String numero;
	
	public Contatto (String name, String num) {
		
		nome = name;
		numero = num;
	}
	
	public String stampa() {
		
		String contatto = nome + " - " + numero;
		
		return contatto;		
	}

}
