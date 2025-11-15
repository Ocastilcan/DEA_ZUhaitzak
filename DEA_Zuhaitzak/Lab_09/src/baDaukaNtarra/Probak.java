package baDaukaNtarra;

import java.io.File;
import java.util.Scanner;

public class Probak {

	public static void main(String[] args) throws Exception {
		Scanner input;
		ZuhaitzNtarra<Integer> zuhaitza;

		System.out.println("ZUHAITZ N-TARRAK BADAUKA:\n");
		for (int i = 0; i <= 4; i++) {
			input = new Scanner(new File("datuakNtarra/zntarra" + i + ".txt"));
			zuhaitza = new ZuhaitzNtarra<Integer>(input, Integer.TYPE);
			System.out.println("Zuhaitza" + i + ": " + zuhaitza);

			Integer zenb = 10;
			System.out.println(zenb + " zenbakiaren bilaketa: " + zuhaitza.baDauka(zenb));
			System.out.println();
		}
	}
}
