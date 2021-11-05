package model;

public class Triangolo {
	
	Punto a, b, c;
	Segmento ab, bc, ac;
	
	public Triangolo(Punto a, Punto b, Punto c) {
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
