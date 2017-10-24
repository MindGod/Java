package main;

import java.util.Scanner;

public class Apple {
		
		
		Scanner input = new Scanner(System.in);
		
		String color = "red";
		float mass = 0.2f;
		
//		Konstruktorius
		public Apple() {
			System.out.println("hi");
		}
		
		void sayColor() {
			System.out.println("spalva: " + color);
		}
		
		float getMass() {
			return mass;
		}
		
		void saySomething(String text, int h) {
			System.out.println(text);
			System.out.println(h);
		}
		
		int add(int k, int r) {
			int temp = k + r;
			return temp;
		}

	}


