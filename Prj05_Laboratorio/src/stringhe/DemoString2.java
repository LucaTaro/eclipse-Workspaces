package stringhe;

public class DemoString2 {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello there";
		
		for (int i = 0; i < s1.length(); i++) {
			//System.out.println(s1.charAt(i));
			if (s1.charAt(i) == s2.charAt(i)) {
				System.out.println("Il carattere " + i + " è uguale");
			}
		}
	}

}
