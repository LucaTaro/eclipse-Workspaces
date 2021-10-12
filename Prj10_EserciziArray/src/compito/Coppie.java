package compito;

import java.util.Scanner;

public class Coppie {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Quanti numeri vuoi inserire?");
		i = sc.nextInt();
		int[] numeri = new int[i];
		
		for (int j = 0; j < numeri.length; j++) {
			System.out.println("Inserire i numeri");
			numeri[j] = sc.nextInt();
		}
		
		int flag = 0;
		
		for (int j = 0; j < numeri.length; j++) {
			for (int k = j+1; k < numeri.length; k++) {
				if(numeri[j] == numeri[k]) {
					System.out.println("C'è una coppia del numero " + numeri[j]);
					flag = -1;
					break;
				}
			}
		}
		
		if (flag == 0) 
			System.out.println("Nessuna coppia trovata");
		
	}

}
