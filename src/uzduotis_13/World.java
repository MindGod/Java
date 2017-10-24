package uzduotis_13;

import java.util.Scanner;

public class World {
	
	Scanner input = new Scanner(System.in);
	
//	Sukurti klase "World".
//	Klasë "World" turi 2 kintamuosius:
//	    String name;
//	    Int size = 0;
//
//	Sukurti tuðèia konstruktoriu.
//	Sukurit vienà metodà, kuris kai yra paleidþiamas, padidina "size" kintamojo reikðme vienetu.
	
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
