package uzduotis_13;

import java.util.Scanner;

public class World {
	
	Scanner input = new Scanner(System.in);
	
//	Sukurti klase "World".
//	Klas� "World" turi 2 kintamuosius:
//	    String name;
//	    Int size = 0;
//
//	Sukurti tu��ia konstruktoriu.
//	Sukurit vien� metod�, kuris kai yra paleid�iamas, padidina "size" kintamojo reik�me vienetu.
	
	int size = 0;
	String name;
	
	public World() {
		System.out.println("sup");
	}
	
	void saySize() {
		System.out.println("tavo pradinis skaicius: " + size);
	}
	
	void add() {
		size ++;
		System.out.println("tavo skaicius, tik tai pridejo viena: " + size);
	}
	
	void minus() {
		size --;
		System.out.println("tavo skaicius, kai pridejo viena ir po to ateme viena: " + size);
	}
	
	

}
