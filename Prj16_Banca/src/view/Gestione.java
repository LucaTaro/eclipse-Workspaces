package view;

import controller.Filiale;
import model.Cliente;

public class Gestione {

	public static void main(String[] args) {

		/*Cliente c1 = new Cliente("Bob");
		Cliente c2 = new Cliente("Paperino");
		Cliente c3 = new Cliente("Pippo");
		//Cliente c4 = new Cliente("Titti");

		AnagraficaCliente.addCliente(c1);
		AnagraficaCliente.addCliente(c2);
		AnagraficaCliente.addCliente(c3);
		AnagraficaCliente.addCliente(new Cliente("Titti"));
		
		System.out.println(AnagraficaCliente.getClienti().size());
		for (Cliente c : AnagraficaCliente.getClienti()) {
			System.out.println(c.getNome());
		}
		
		ArrayList<Cliente> clienti1 = new ArrayList<Cliente>();
		clienti1.add(c1);
		clienti1.add(c2);
		
		ContoCorrente cc1 = new ContoCorrente(clienti1);
		cc1.addMovimento(new Movimento(100, "Bukkin"));
		cc1.addMovimento(new Movimento(-50, "Multa"));
		System.out.println(cc1.getSaldo());
		
		ContoCorrente cc2 = new ContoCorrente(clienti1);
		System.out.println(cc1.elencoTitolari());*/
		Filiale viaRoma = new Filiale("Via roma");
		Filiale viaPo = new Filiale("Via Po'");
		
		viaRoma.addCliente("Er coatto");
		Cliente c = viaRoma.findByName("Er coatto");
		viaRoma.addConto(c);
	}

}
