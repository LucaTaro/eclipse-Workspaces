package view;

import java.util.Scanner;

import controller.Contatti;

public class Rubrica {
	
	public static void main (String[] args) {
		
		Contatti rubrica = new Contatti(10);
		
		boolean b = true;
		char scelta;
		
		while (b) {
			scelta = askUser();
			
			if (scelta == 'q') {
				b = false;
				System.out.println("Arrivederci");
			} else { if (scelta == 'a') {
				String cognome = testoNome();
				String cell = testoNumero();
				int posizione = posContatto();
				rubrica.addContatto(cognome, cell, posizione);
			} if (scelta == 'b') {
				rubrica.stampaTutto();
			} if (scelta =='c') {
				int posizione = posContatto();
			}
				}
		}
		
	}

	private static char askUser() {
		System.out.println("**********");
		System.out.println("a) Inserire un contatto");
		System.out.println("b) Stampare la rubrica");
		System.out.println("c) Stampare un contatto");
		System.out.println("q) Uscire");
		System.out.println("**********");
		Scanner sc = new Scanner(System.in);
		char risp = sc.nextLine().charAt(0);
		return risp;
	}

	private static String testoNumero() {
		System.out.println("Inserisci il numero di telefono");
		Scanner sc = new Scanner(System.in);
		String risposta = sc.nextLine();
		return risposta;
	}

	private static int posContatto() {
		System.out.println("Inserisci la posizione del contatto da visualizzare");
		Scanner sc = new Scanner(System.in);
		int risp = sc.nextInt();
		return risp;
	}

	private static String testoNome() {
		System.out.println("Inserisci il nome del contatto");
		Scanner sc = new Scanner(System.in);
		String risposta = sc.nextLine();
		return risposta;
	}

}
