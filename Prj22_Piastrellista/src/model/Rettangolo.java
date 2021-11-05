package model;

public class Rettangolo extends Forma {
	
	Segmento ab, bc, cd, da;

	public Rettangolo(String nome, Segmento ab, Segmento bc) {
		super(nome);
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
