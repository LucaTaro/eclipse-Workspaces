package Animali;

public class Canile {

	public static void main(String[] args) {
		
		Cane bobi = new Cane();//ho costruito il primo cane
		bobi.colore = "bianco";
		bobi.eta = 12;
		
		
		bobi.schedaAnimale();
		
		Cane fido = new Cane();//costruttore dell'oggetto cane
		fido.colore = "nero";
		fido.eta = 1;
		
		fido.schedaAnimale();
		
		Gatto mau = new Gatto();
		mau.nome = "Massimo";
		System.out.println("Il mio gatto si chiama " + mau.nome);
		mau.faiFusa();
		
	}

}
