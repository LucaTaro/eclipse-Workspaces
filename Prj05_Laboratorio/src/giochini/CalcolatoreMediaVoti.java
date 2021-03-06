package giochini;

import java.util.Scanner;

public class CalcolatoreMediaVoti {
	
	public static void main(String[] args) {
		
		//chiedi all'utente quanti esami
		int nEsami = chiediQuantiEsami();
		 //chiedi voti
		int[] esami = new int[nEsami];
		chiediVotiEsami(esami);
		double totale = 0;
		//stampa
		for (int i = 0; i < esami.length; i++) {
			System.out.println(esami[i]);
			totale += esami[i];
		}
		System.out.println("La media aritmetica dei voti ? " + totale / nEsami);
	}

	private static void chiediVotiEsami(int[] esami) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < esami.length; i++) {
			System.out.println("Dammi il voto dell'esame " + i);
			esami[i] = sc.nextInt();
		}
		
	}

	private static int chiediQuantiEsami() {
		System.out.println("Quanti esami vuoi contare?");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
}
