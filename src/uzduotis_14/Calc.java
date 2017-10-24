package uzduotis_14;

import java.util.Scanner;

public class Calc {

	Scanner input = new Scanner(System.in);

	int x1;
	int x2;
	int x3;

	int y1;
	int y2;
	int y3;

	public Calc() {
		

	}

	void distance_monster_1(Player player, Monster_1 monster_1) {
		double lenght = Math.sqrt(Math.pow(monster_1.x2 - player.x1, 2) + Math.pow(monster_1.y2 - player.y1, 2));
		System.out.println(lenght);
	}

	void closer(Player player, Monster_1 monster_1, Monster_2 monster_2) {
		double lenght = Math.sqrt(Math.pow(monster_1.x2 - player.x1, 2) + Math.pow(monster_1.y2 - player.y1, 2));
		double lenght_2 = Math.sqrt(Math.pow(monster_2.x3 - player.x1, 2) + Math.pow(monster_2.y3 - player.y1, 2));

		if (lenght < lenght_2) {
			System.out.println("pirmas monstras yra arciau zaidejo");
		} else {
			System.out.println("antras monstras yra arciau zaidejo");
		}

	}

}
