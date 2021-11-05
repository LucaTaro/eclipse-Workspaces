package view;

import controller.GestioneArticolo;

public class Scontrino {

	public static void main(String[] args) {
		
		GestioneArticolo ctrl = new GestioneArticolo();
		
		ctrl.addArticolo("Farina", 0.8, 1.5);
		ctrl.addArticolo("Pollo", 2.99, 1.43);
		ctrl.stampaScontrino();
		System.out.println("");
		ctrl.getArticoli().get(0).applicaSconto(5);
		ctrl.stampaScontrino();
	}

}
