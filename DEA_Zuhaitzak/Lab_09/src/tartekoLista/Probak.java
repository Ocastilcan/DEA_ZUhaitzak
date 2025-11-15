package tartekoLista;

import java.io.File;
import java.util.Scanner;
import java.util.LinkedList;

public class Probak {

	public static void main(String[] args) throws Exception {
		int behe = 7;
		int goi = 18;
		Scanner input;

		System.out.println("PROBA TARTEKO LISTA:");
		for (int i = 0; i <= 6; i++) {
			input = new Scanner(new File("datuakBZB/BZBzuhaitza" + i + ".txt"));
			BZB zuhaitza = new BZB(input);
			System.out.println("=================");
			LinkedList<Integer> emaitza = zuhaitza.tartekoLista(behe, goi);	
			System.out.println("Zuhaitza"+ i +": " + zuhaitza);
			System.out.println("behe: " + behe + ", goi: " + goi);
			System.out.println("Tartean dauden zenbakien lista: " + emaitza);
			System.out.println();
			input.close();			
		}
	}
}
