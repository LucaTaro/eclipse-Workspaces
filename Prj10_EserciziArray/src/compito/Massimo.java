package compito;

import java.util.Scanner;

public class Massimo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Quanti numeri si vogliono inserire?");
		i = sc.nextInt();
		
		double contenitore[] = new double[i];
		
		for (i = 0; i < contenitore.length; i++) {
			contenitore[i] = Math.random();
		}
		
		for (int j = 0; j < contenitore.length; j++) {
			System.out.println(contenitore[j]);
		}
		double massimo = 0;
		
		for (int j = 0; j < contenitore.length; j++) {
			if (contenitore[j] > massimo)
				massimo = contenitore[j];
		}
		
		System.out.println("Il massimo ? " + massimo);
	}

}
