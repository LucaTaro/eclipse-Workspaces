package enumerazioni;

public enum Taglie {

	S(38), M(42), L(46), XL(50);
	
	private int tagliaeu;
	
	private Taglie(int tagliaeu) {
		this.tagliaeu = tagliaeu;
	}
	
	public String stampaTaglia() {
		return "La taglia in formato EU è " + this.tagliaeu;
	}
}
