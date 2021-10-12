package Gioco;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		 
		//1) Chiedo scelta utente
			//creo un oggetto scanner che è nel metodo private
				
		//2) Memorizzo scelta utente
		String sceltaUtente = chiediAllUtente();
			
		//3) Scelta PC
		String sceltaPc = chiedoAlPc(); //parenti indicano sia un metodo non una variabile
		//4) Memorizzo scelta PC
		//5) Valuto scelta umano e scelta PC
		String risultato = valutazione(sceltaUtente, sceltaPc);
		
		//6) Stampo  il risultato*/
		
		System.out.println("Umano " + sceltaUtente);	
		System.out.println("Pc " + sceltaPc);
		System.out.println("risultato " + risultato);
		//system=classe, out=metodo, println=proprietà
	}
	
	private static String valutazione(String sceltaUtente, String sceltaPc) {
		String risultato = null;
		if (sceltaUtente.equals(sceltaPc)) {
			risultato = "parteggio";
		} else {
			risultato = "vince uno dei due";
			if (sceltaUtente.equals("carta")) {
				if (sceltaPc.equals("pietra")) {
					risultato = "vince umano";
				} else {
					risultato = "vince Pc";
				}
			}
		}
		return risultato;
	}

	private static String chiediAllUtente () {
		System.out.println("Scegli tra pietra, forbici, carta.");
		Scanner input = new Scanner(System.in);
		String risposta = input.nextLine();
		return risposta;
	}
	
	private static String chiedoAlPc() {
		String risposta = null;
		double casuale = Math.random();
		if (casuale < 0.33) {
			risposta = "carta";
		} else if (casuale < 0.66) {
			risposta = "forbici";
		} else {
			risposta = "pietra";
		}
		
		return risposta;
	}
}
