package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestionalePizza;
import model.Pizza;

public class MenuPizzeria {

	public static void main(String[] args) {

		GestionalePizza ctrl = new GestionalePizza();
		ArrayList<Pizza> pizze = ctrl.getPizze();
		
		System.out.println("Scegli menu");
		System.out.println("a) pizze al tegamino");
		System.out.println("b) pizze al mattone");
		System.out.println("c) bevande");
		
		Scanner sc = new Scanner(System.in);
		String risposta = sc.nextLine();
		char c = risposta.toLowerCase().charAt(0);
		switch (c) {
		case 'a':
			ctrl.initMenu("pizze/pizze.tegamino.txt");
			
			pizze = ctrl.getPizze();
	
			for (Pizza pizza : pizze) {
				System.out.println(pizza);
			}
			break;
		case 'b':
			ctrl.initMenu("pizze/pizze.mattone.txt");
			
			pizze = ctrl.getPizze();
			for (Pizza pizza : pizze) {
				System.out.println(pizza);
			}
			break;
		case 'c':
			
			break;
		default:			
			break;
		}
		
		
		
		
	}

}
