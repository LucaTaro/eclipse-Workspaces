package gioco;

public class DadiUguali {
	
	public static void main(String[] args) {
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		int contatore = 100;
		int vittoria = 0, sconfitta = 0;
		
		for(int i = 0; i < contatore; i++) {
			d1.lancia();
			d2.lancia();
			
			if (d1.valore == d2.valore) {
				//System.out.println("Vittoria");
				vittoria ++;
			}
			else {
				//System.out.println("Sconfitta");
				sconfitta++;
			}
			
		}
		System.out.println("Hai vinto " + vittoria);
		/*double p = contatore / vittoria;
		if (p<0.5) {
			double pp = p * 100;
		} else {
			double pp = 100 - (p*100);
		}*/
		
		System.out.println("La percentuale è " /*+ pp + " %"*/);
	}

}
