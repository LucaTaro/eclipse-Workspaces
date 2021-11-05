package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import controller.Serie;

public class Gestione {

	public static void main(String[] args) {

		Serie serie = new Serie();
		
		Scanner sc;
		try {
			sc = new Scanner(new File("daje/Bob"));
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		serie.stampaElenco();
	}

}
