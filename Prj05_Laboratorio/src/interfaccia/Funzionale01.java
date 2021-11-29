package interfaccia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Funzionale01 {

	public static void main(String[] args) {

		List<String> auto = Arrays.asList(
				"Ferrari", "Peugeot", "Ford", "Fiat"
				);
				
		Collections.sort(auto);
		for (String automobile : auto) {
			if(automobile.startsWith("F"))
				System.out.println(automobile.toUpperCase());
		}
		
		auto
			.stream()
				.filter(a -> a.startsWith("F"))
					.sorted()
						.forEach(a -> System.out.println(a.toUpperCase()));
	}
}
