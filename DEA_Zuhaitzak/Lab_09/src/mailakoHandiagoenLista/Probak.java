package mailakoHandiagoenLista;

import java.io.File;
import java.util.Scanner;
import java.util.LinkedList;

public class Probak {

	public static void main(String[] args) throws Exception {
		Scanner input;
		System.out.println("PROBA MAILAKO HANDIAGOEN LISTA:");
		for (int i = 0; i <= 6; i++) {
			input = new Scanner(new File("datuakBZB/BZBzuhaitza" + i + ".txt"));
			BZB zuhaitza = new BZB(input);
			System.out.println("BZBBuhaitza" + i + ".txt: " + zuhaitza);
            LinkedList<Integer> lista1 = zuhaitza.mailakoHandiagoenLista(0, 6);            
            System.out.println("6 baino handiagoak 0 mailan: "+lista1);
            
            LinkedList<Integer> lista2 = zuhaitza.mailakoHandiagoenLista(2, 8);            
            System.out.println("8 baino handiagoak 2 mailan: "+lista2);
            
            LinkedList<Integer> lista3 = zuhaitza.mailakoHandiagoenLista(3, 3);            
            System.out.println("3 baino handiagoak 3 mailan: "+lista3);
            
            LinkedList<Integer> lista4 = zuhaitza.mailakoHandiagoenLista(4, 10);            
            System.out.println("10 baino handiagoak 4 mailan: "+lista4);
            
			System.out.println();
			input.close();			
		}
	}
}