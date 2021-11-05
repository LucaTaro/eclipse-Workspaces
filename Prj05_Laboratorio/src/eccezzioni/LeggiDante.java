package eccezzioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LeggiDante {

	public static void main(String[] args) {
		
		File divina = new File("files/divina.txt");
		
		try {
			Scanner sc = new Scanner(divina);
			String s = sc.nextLine();
			ArrayList<String> parole = new ArrayList<>();
			HashSet<String> paroleNonRipetute = new HashSet<>();
			while (sc.hasNext()) {
				s = (String) sc.next();
				paroleNonRipetute.add(s);
				parole.add(s);
			}
			System.out.println("Dante ha scritto " + parole.size() + " parole");
			System.out.println("Dante ha scritto " + paroleNonRipetute.size() + " parole non ripetute");
		} catch (FileNotFoundException e) {
			System.err.println("File non trovato cojone " + e);
		}
	}

}
