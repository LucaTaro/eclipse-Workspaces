package array;

public class DemoString {

	public static void main(String[] args) {
		
		/*String s1 = "Hello";
		String s2 = " there";
		
		String s3 = s1 + s2;
		String s4 = "Hello there";
		char[] caratteri = {'h', 'e', 'l', 'l', 'o'};
		String s5 = new String(caratteri);
		
		System.out.println(s3.equals(s4) );// == valido solo per i primitivi non gli oggetti
		System.out.println(s1.equalsIgnoreCase(s5));*/
		
		String[] settimana = {
				"luned�",
				"marted�",
				"mercoled�",
				"gioved�",
				"venerd�",
				"sabato",
				"domenica"
		};
		for (String giorno : settimana) {
			System.out.print(giorno.toUpperCase().
					concat(" | "));
		}
	}

}
