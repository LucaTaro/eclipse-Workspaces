package array;

public class ProvaArrayInteri {

	public static void main(String[] args) {
		//inizializza 1
		
		int[] voti = new int[5];
		voti[0] = 10;
		voti[1] = 6;
		//voti[2] = 8;
		voti[3] = 4;
		voti[4] = 2;
		
		// inizializza 2
		int[] voti2 = {10,6,8,4,2};
		
		for (int i=0; i<voti.length; i++) {
			System.out.println(voti[i]);
		}
		//ciclo for migliorato
		for (int voto : voti) {
			System.out.println(voto);
			
		}
	}

}
