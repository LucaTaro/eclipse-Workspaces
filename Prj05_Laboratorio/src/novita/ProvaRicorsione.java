package novita;

import java.math.BigDecimal;

public class ProvaRicorsione {
	
	public static void main(String[] args) {
		
		double d = .012;
		
		double somma = d + d + d;
		
		BigDecimal bigValore = new BigDecimal(Double.toString(d));
		
		BigDecimal bigSomma = bigValore.add(bigValore).add(bigValore);
		
		System.out.println(bigSomma);
		
		int x = 5;
		
		int y = fattoriale(5);
		
		System.out.println(y);
		
	}

	private static int fattoriale(int i) {
		if(i == 0)
			return 1;
		else return i * (fattoriale(i -1));
	}

}
