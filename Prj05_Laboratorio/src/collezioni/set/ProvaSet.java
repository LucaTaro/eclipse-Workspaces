package collezioni.set;

import java.util.HashSet;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		HashSet<String> giorni = new HashSet<String>();
		
		giorni.add("Lunedì");
		giorni.add("Marterdì");
		giorni.add("Mercoledì");
		giorni.add("Lunedì");
		
		TreeSet<String> giorni2 = new TreeSet<String>();
		
		giorni2.add("Lunedì");
		giorni2.add("Marterdì");
		giorni2.add("Mercoledì");
		giorni2.add("Lunedì");
		
		System.out.println(giorni.size());
		
		for (String giorno : giorni) {
			System.out.println(giorno);
		}
		
		System.out.println("");
		
		for (String giorno : giorni2) {
			System.out.println(giorno);
		}
	}

}
