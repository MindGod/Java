package second;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		Sukurti int masyv� 10 lasteli� ilgio.
//		Leisti pa�iam �vestisti reik�mes kiekvienai lastelei.
//		Para�yti program�, kuri ie�kotu ar masyve yra lasteli�, kuriose reik�m�s sutampa. Jeigu sutampa, pirm�j� reik�m� (lastel�je) padidinti vienetu.
//		Daryti tai tol, kol visame masyve nebebus pasikartojan�i� element�.
		
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
