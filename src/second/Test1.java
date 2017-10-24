package second;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 100; 
		int y =	5;
		
		int count = 0;
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);

		if (x > y) {
			System.out.println( y + " < " + x);
		} else {
			System.out.println(y + " > " + x);
		}
		
		while (y <= x) {
//			y += 1;
			y++;
			count++;
		}
		System.out.println("Ciklas prasisuko " + count + " kartus");
		if (x > y) {
			System.out.println( y + " < " + x);
		} else {
			System.out.println(y + " > " + x);
		}
	}

}
