package interfaccia;

public abstract class Frutta {

	String nome;
	double prezzo;

	public Frutta(String nome) {
		super();
		this.nome = nome;
	}
	
	double calcolaPrezzo(double peso) {
		return prezzo * peso;
	}
}
