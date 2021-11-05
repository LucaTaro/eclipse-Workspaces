package controlloflusso;

public class Condizioni {

	public static void main(String[] args) {

		int a = 5, b = 4;
		if (a > b) {
			System.out.println("a è maggiore di b");
		} else if (a == b) { 
			System.out.println("a è uguale di b");
			} else {
				System.out.println("b è maggiore di a");			
				}
		
		char scelta = 'a';
		
		switch (scelta) {
		case 'a':
			System.out.println("bravo pollo");
			break;
		case 'b':
			System.out.println("bravo pollo1");
			break;
		case 'c':
			System.out.println("bravo pollo2");
			break;
		case 'd':
			System.out.println("bravo pollo3");
			break;

		default:
			break;
		} 
			
	}

}
