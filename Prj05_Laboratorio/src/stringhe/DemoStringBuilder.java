package stringhe;

public class DemoStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Ciao");
		sb.append(" string builder");
		sb.append(" il grande costruttore di stringhe dinamiche");
		
		System.out.println(sb.toString());
		
		String s = "";
		s += "ciao";
		s += " string semplice";
		s += " non sono la stessa cosa!";
		System.out.println(s);
	}

}
