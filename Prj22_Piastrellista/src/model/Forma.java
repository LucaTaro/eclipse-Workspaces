package model;

public abstract class Forma {//non si possono creare oggetti
	//classe astratta non posso creare oggetti a partire da unaclasse astratta. Bisogna estenderla ad una 
	//classe concreta per usarla.
	//si può dichiare astratta anche se non vi sono classi astratte ma non viceversa. Non può esserci final
	
	
	String nome;

	public Forma(String nome) {
		this.nome = nome;
	}
	
	public abstract double area();//ppc: programmazione per contratto

}
