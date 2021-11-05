package collezioni.liste;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> giorni = new ArrayList<>();
		
		giorni.add("Lunedì");
		giorni.add("Martedì");
		giorni.add("Mercoledì");
		giorni.add("Giovedì");
		giorni.add("Venerdì");
		giorni.add("Sabato");
		giorni.add("Domenica");
		
		System.out.println(giorni.get(0));
		System.out.println(giorni.size());
		giorni.remove(3);
		System.out.println(giorni.size());
		
		Collections.sort(giorni);

		for (String giorno : giorni) {
			System.out.println(giorno);
		}

	}

}
