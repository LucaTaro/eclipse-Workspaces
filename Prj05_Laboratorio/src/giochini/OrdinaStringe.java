package giochini;

import java.util.Arrays;

public class OrdinaStringe {

	public static void main(String[] args) {

		String[] nani = {
				"cucciolo",
				"mammolo",
				"eolo",
				"dotto",
				"pisolo",
				"brontolo",
				"gongolo"
		};
		
		Arrays.sort(nani);
		
		for (String nano : nani) {
			System.out.println(nano);
		}

	}

}
