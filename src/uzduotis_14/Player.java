package uzduotis_14;

import java.util.Scanner;

public class Player {
	
	Scanner input = new Scanner (System.in);
	
	int x1;
	int y1;
	
	public Player() {

	}
	void Player_cord() {
	System.out.println("parasyk zaidejo kordinates (x1, y1)");
	System.out.println("parasyk x: ");
	x1 = input.nextInt();
	System.out.println("parasyk y: ");
	y1 = input.nextInt();
	}

}
