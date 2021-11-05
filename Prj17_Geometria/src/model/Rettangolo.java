package model;

public class Rettangolo {
	
	Segmento ab, bc, cd, da;

	public Rettangolo(Segmento ab, Segmento bc) {
		this.ab = ab;
		this.bc = bc;
	}
	
	public double perimetro() {
		return 2 * (ab.lunghezza() + bc.lunghezza());
	}
	
	public double area() {
		return ab.lunghezza() * bc.lunghezza();
	}
}
