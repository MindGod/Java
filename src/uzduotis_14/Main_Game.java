package uzduotis_14;

import java.util.Scanner;

public class Main_Game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Player x = new Player();
		x.Player_cord();
		Monster_1 y = new Monster_1();
		y.Monster_1_cord();
		Monster_2 k = new Monster_2();
		k.Monster_2_cord();
		Calc h = new Calc();
		h.distance_monster_1(x, y);
		h.closer(x, y, k);

	}

}
