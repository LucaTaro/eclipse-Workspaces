package collezioni.liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListaVoti {

	public static void main(String[] args) {
		int somma = 0;
		ArrayList<Integer> voti = new ArrayList<Integer>();
		Random casuale = new Random();
		
		for (int i = 0; i < 10; i++) {
			voti.add(casuale.nextInt(31));			
		}
		
		for (Integer voto : voti) {
			System.out.println(voto);
			}
		System.out.println();
		
		Collections.sort(voti);
		for (Integer voto : voti) {
			somma += voto;
			System.out.println(voto);
		}
		
		double media = somma / (double)voti.size();
		System.out.println(media);
		
	}

}
