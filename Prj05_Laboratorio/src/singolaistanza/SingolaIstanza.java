package singolaistanza;

public class SingolaIstanza {
	
	private static SingolaIstanza si;
	private SingolaIstanza() {
		si = new SingolaIstanza();
	}
	
	public static SingolaIstanza getSi() {
		if(si == null) new SingolaIstanza();
		return si;
	}
}