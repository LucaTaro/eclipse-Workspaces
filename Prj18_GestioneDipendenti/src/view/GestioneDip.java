package view;

import controller.LibroMatricola;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class GestioneDip {

	public static void main(String[] args) {

		Fattorino f = new Fattorino("sara");
		f.setConsegne(100);
		Fattorino f1 = new Fattorino("luca");
		f1.setConsegne(80);
		
		Impiegato i = new Impiegato("bob");
		i.setOreLavorate(60);
		Impiegato i1 = new Impiegato("firminei");
		i1.setOreLavorate(120);
		
		Dirigente d = new Dirigente("cutillo");
		d.setPremio(700);
		
		LibroMatricola.dipendenti.add(f);
		LibroMatricola.dipendenti.add(f1);
		LibroMatricola.dipendenti.add(i);
		LibroMatricola.dipendenti.add(i1);
		LibroMatricola.dipendenti.add(d);
		
		double totale = 0;
		for (Dipendente dip : LibroMatricola.dipendenti) {
			System.out.println(dip);
			System.out.println(dip.calcolaPaga());
			totale += dip.calcolaPaga();
		}
		System.out.println(totale);
	}

}
