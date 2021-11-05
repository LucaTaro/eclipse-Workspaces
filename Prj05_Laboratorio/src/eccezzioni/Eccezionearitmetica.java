package eccezzioni;

public class Eccezionearitmetica {

	public static void main(String[] args) {

		int x = 100;
		int y = 0;
		
		int[] voti = {28,26,24,18,15,6,0,12,15,30};
		
		double r = 0.0;
		
		try {
			for (int i = 0; i < voti.length; i++) {
				if (voti[i] > 0)
					r = x/voti[i];
				else
					throw new ArithmeticException("presente numero 0");
				System.out.println(r);
			}
		}
		catch (ArithmeticException e) {
			System.err.println("Errore aritmetico");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("Pirla");
		}
	}

}
