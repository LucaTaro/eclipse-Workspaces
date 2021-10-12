package compito;


import java.util.Scanner;

public class Crescenti {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Quanti numeri si vogliono inserire?");
		i = sc.nextInt();
		
		double contenitore[] = new double[i];
		
		System.out.println("Inserire i " + i + " numeri");
		for (int j = 0; j < contenitore.length; j++) {
			System.out.println("Inserire il " + j   + "° numero");
			double numeri = sc.nextDouble();
			contenitore[j] = numeri;
		}
		
		/*for (int j = 0; j < contenitore.length; j++) {
			int k = contenitore.length;
			if (contenitore[j] > contenitore[k]) {
				double temp;
				temp = contenitore[k];
				contenitore[j] = contenitore[k];
				contenitore[j] = temp;
				k--;
			}
		}*/
		
		for (int j = 0; j < contenitore.length; j++) {
			System.out.print(contenitore[j] + " - ");
		}

	}

}
