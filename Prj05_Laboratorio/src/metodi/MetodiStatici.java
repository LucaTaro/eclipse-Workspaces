package metodi;

public class MetodiStatici {

	public static void main(String[] args) {
		MetodiStatici.stampaMessaggio("Ciao mondo");
		MetodiStatici.stampaMessaggio("come va");
		

	}

	private static void stampaMessaggio(String string) {
		System.out.println("-----------");
		System.out.println(string);
		System.out.println("-----------");
	}

}
