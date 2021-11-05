package model;

public class Dipendente {
	
	private static int matricolatore = 1;
	protected String nome;
	protected int matricola;
	
	public Dipendente(String nome) {
		this.matricola = matricolatore++;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Il dipendente " + nome + ", ha matricola " + matricola;
	}
	
	public double calcolaPaga() {
		return 0;
	}
}
