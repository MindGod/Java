package second;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		Sukurti int masyvà 10 lasteliø ilgio.
//		Leisti paèiam ávestisti reikðmes kiekvienai lastelei.
//		Paraðyti programà, kuri ieðkotu ar masyve yra lasteliø, kuriose reikðmës sutampa. Jeigu sutampa, pirmàjà reikðmæ (lastelëje) padidinti vienetu.
//		Daryti tai tol, kol visame masyve nebebus pasikartojanèiø elementø.
		
		int[] x = new int [10];
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("koki skaiciu pasirinki?");
			x[i] = input.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			while (x[0] == x[i]-x[0]) {
				x[0]++;
			}
		}
		System.out.println(x[0]);
	}

}
