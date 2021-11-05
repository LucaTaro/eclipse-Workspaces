package model;

public class Quadrato extends Rettangolo{
	
	Segmento lato;
	
	public Quadrato(Segmento ab) {
		super(ab, ab);
		this.lato = ab;
	}
	
	public double area() {
		System.out.println("Formula del quadrato");
		return Math.pow(this.lato.lunghezza(), 2);
	}

}
