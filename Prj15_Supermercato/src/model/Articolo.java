package model;

public class Articolo {
	
	private String nome;
	private double prezzoAlChilo;
	private double peso;
	
	public Articolo(String nome, double prezzoAlChilo, double peso) {
		this.nome = nome;
		this.prezzoAlChilo = prezzoAlChilo;
		this.peso = peso;
	}
	/**
	 * Questo metodo restituisce il nome del prodotto
	 * @param nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Questo metodo modifica il nome del prodotto
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Questo metodo restituisce il prezzo al chilo del prodotto
	 * @param prezzoAlChilo
	 */
	public double getPrezzoAlChilo() {
		return prezzoAlChilo;
	}
	/**
	 * Questo metodo modifica il prezzo al chilo del prodotto
	 * @param prezzoAlChilo
	 */
	public void setPrezzoAlChilo(double prezzoAlChilo) {
		this.prezzoAlChilo = prezzoAlChilo;
	}
	/**
	 * Questo metodo restituisce il peso del prodotto
	 * @param peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * Questo metodo modifica il peso del prodotto
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Articolo [nome=" + nome + ", prezzoAlChilo=" + prezzoAlChilo + ", peso=" + peso + "]";
	}
	
	public void applicaSconto(double sconto) {
		this.prezzoAlChilo = this.prezzoAlChilo * (1-sconto/100);
	}
	
	public double calcolaPrezzo() {
		return this.peso * this.prezzoAlChilo;
	}	
	
	public int puntiFedelta() {
		return (int) (this.calcolaPrezzo()/2);
	}
}
