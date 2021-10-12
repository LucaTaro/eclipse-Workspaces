package array;

import java.util.Iterator;

public class DemoCaratteri {

	public static void main(String[] args) {
		
		char c = 'a';
		
		for (int i = 0; i <10000; i++) {
			System.out.print( (char) i);
			if(i%15 == 0)
				System.out.println();
		}
	}

}
