package view;

import controller.BancaController;
import model.Cliente;

public class Gestione {

	public static void main(String[] args) {

		BancaController bc = new BancaController();
		bc.addCliente("Luca", "Zavattaro");
		bc.addCliente("Sara", "Padoan");
		int i = bc.trovaCliente("Sara", "Padoan");
		Cliente c = bc.trovaCliente(i);
		System.out.println(c.getNome());
		bc.addConto(c);
		bc.reportCliente();
		bc.reportConti();
		
	}

}
