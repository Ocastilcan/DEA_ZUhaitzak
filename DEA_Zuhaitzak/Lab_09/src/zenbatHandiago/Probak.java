package zenbatHandiago;


import java.io.File;
import java.util.Scanner;


public class Probak {
	
	public static void main(String[] args) throws Exception {
		Scanner input;

		int x = 8;
		System.out.println("ZENBAT HANDIAGO:\n");
		for (int i = 0; i <= 6; i++) {
			input = new Scanner(new File("datuakBZB/BZBzuhaitza" + i + ".txt"));
			BZB zuhaitza = new BZB(input);
			System.out.println("=================");
			System.out.println("Zuhaitza" + i +": " + zuhaitza);	
			System.out.println("ZENBAT HANDIAGOAK 8 BAINO: "+zuhaitza.zenbatHandiago(x));
			System.out.println();
			input.close();			
		}	
	}
}
