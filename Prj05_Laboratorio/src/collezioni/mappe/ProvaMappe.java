package collezioni.mappe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvaMappe {

	public static void main(String[] args) {

		Map<String, String> regioni = new HashMap<String, String>();
		
		//				set		  list
		regioni.put("Piemonte", "Torino");
		regioni.put("Lombardi", "Milano");
		regioni.put("Lazio", "Roma");
		
		Set<String> keySet = regioni.keySet();
		System.out.println(keySet);
		
		for (String capoluogo : keySet) {
			System.out.println(regioni.get(capoluogo));			
		}
		
		regioni.get("Piemonte");

	}

}
