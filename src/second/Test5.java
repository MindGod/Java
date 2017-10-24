package second;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] x = new int[5];
		int sum = 0;
		int k = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("koki skaiciu pasirinki?");
			x[i] = input.nextInt();
			sum += x[i];
		}
		System.out.println(sum);
		System.out.println("Koks bus n?");
		int y = input.nextInt();
		for (int i = 0; i < 5; i++) {
			if (y == x[i]) {
				k++;
			}
		}
		System.out.println("n yra: " + k);
	}

}
