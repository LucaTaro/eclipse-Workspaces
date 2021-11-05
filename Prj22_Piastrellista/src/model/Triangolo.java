package model;

public class Triangolo extends Forma {
	
	Punto a, b, c;
	Segmento ab, bc, ac;
	
	public Triangolo(String nome, Punto a, Punto b, Punto c) {
		super(nome);
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento (a,b);
		this.bc = new Segmento (b,c);
		this.ac = new Segmento (a,c);
		
	}
	
	public double perimetro() {
		return ab.lunghezza() + bc.lunghezza() + ac.lunghezza();
	}
	
	public double area() {
		double sp = this.perimetro()/2;
		return Math.sqrt(sp * 
				(sp - ab.lunghezza()) * 
				(sp - ac.lunghezza()) * 
				(sp - bc.lunghezza())
				);
	}

}
