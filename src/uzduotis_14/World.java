package uzduotis_14;

import java.util.Scanner;

public class World {
	
	Scanner input = new Scanner (System.in);
	
	
	int x1;
	int x2;
	int x3;
	
	int y1;
	int y2;
	int y3;
	
	public World () {
		
	}
	
	void distance_monster_1() {
		double lenght = Math.sqrt ( Math.pow ( x2-x1 , 2 ) + Math.pow ( y2-y1 , 2 ) );
		System.out.println(lenght);
	}
	void closer() {
		double lenght = Math.sqrt ( Math.pow ( x2-x1 , 2 ) + Math.pow ( y2-y1 , 2 ) );
		double lenght_2 = Math.sqrt ( Math.pow ( x3-x1 , 2 ) + Math.pow ( y3-y1 , 2 ) );
		
		if (lenght < lenght_2) {
			System.out.println("pirmas monstras yra arciau zaidejo");
		} else {
			System.out.println("antras monstras yra arciau zaidejo");
		}
		
	}

}
