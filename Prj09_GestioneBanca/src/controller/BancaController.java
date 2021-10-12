package controller;

import model.Cliente;
import model.ContoCorrente;


public class BancaController {
	
	private Cliente[] clienti;
	private ContoCorrente[] conti;
	
	public BancaController () {
		clienti = new Cliente[100];
		conti = new ContoCorrente[100];
	}
	
	public void addCliente(String nome, String cognome) {
		int pos = trovaPostoLibero();
		if (pos > -1) {
			Cliente temp = new Cliente(nome, cognome);
			clienti[pos] = temp;
			System.out.println("Cliente aggiunto");
		} else {
			System.out.println("Cliente NON aggiungo");
		}
		
	}
	
	public int trovaCliente(String nome, String cognome) {
		
		for (int i = 0; i < clienti.length; i++) {
			if (clienti[i] != null) {
				if (clienti[i].getNome().equals(nome + " " + cognome)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public Cliente trovaCliente(int id) {
		return clienti[id];
	}
	
	public void addConto(Cliente c) {
		int pos = trovaPostoConti();
		if (pos > -1) {
			ContoCorrente temp = new ContoCorrente(c);
			conti[pos] = temp;
			System.out.println("Conto aggiunto con successo");
		} else {
			System.out.println("Conto NON aggiungo");
		}
	}

	private int trovaPostoLibero() {
		for (int i = 0; i < clienti.length; i++) {
			if(clienti[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	private int trovaPostoConti() {
		for (int i = 0; i < conti.length; i++) {
			if(conti[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public void reportCliente() {
		System.out.println("Elenco clienti aggiornato");
		for (Cliente cliente : clienti) {
			if (cliente != null)
			System.out.println(cliente.getNome());
		}
	}
	
	public void reportConti() {
		System.out.println("Elenco conti aggiornato");
		for (ContoCorrente conto : conti) {
			if (conto != null)
			System.out.println(conto.dammiNumero() + " ");
			System.out.println(conto.getCliente().getNome());
		}
	}
}
