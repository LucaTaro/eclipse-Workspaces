package view;

import controller.Calcolatrice;
import controller.CalcolatriceStatica;
import controller.Math;

public class DemoCalcolatrice {

	public static void main(String[] args) {
		
		double addendo1 = 15.5;
		double addendo2 = 14.5;
		
		CalcolatriceStatica.addizione(addendo1, addendo2);
		
		Math.sottrazione(addendo1, addendo2);
		
		Calcolatrice calc1 = new Calcolatrice();//creo l'oggetto calc1 poich� non � una classe static ed � utilizzabile da pi� persone contemporaneamente
		calc1.moltiplicazione(addendo1, addendo2);
		
	}

}
