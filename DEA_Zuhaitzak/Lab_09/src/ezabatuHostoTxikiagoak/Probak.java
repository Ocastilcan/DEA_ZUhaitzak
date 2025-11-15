package ezabatuHostoTxikiagoak;

import java.io.File;
import java.util.Scanner;


public class Probak {
	
	public static void main(String[] args) throws Exception {
		Scanner input;

		int e = 19;
		System.out.println("EZABATU HOSTO TXIKIAGOAK:\n");
		for (int i = 0; i <= 6; i++) {
			input = new Scanner(new File("datuakBZB/BZBzuhaitza" + i + ".txt"));
			BZB zuhaitza = new BZB(input);
			System.out.println("Zuhaitza" + i +": " + zuhaitza);	
			BZB emaitza = zuhaitza.ezabatuHostoTxikiagoak(e);	
			System.out.println(e + " baino txikiagoak diren hostoak EZABATU DIRA:");			
			System.out.println("Zuhaitza: " + emaitza);	
			System.out.println();
			input.close();			
		}	
	}
}