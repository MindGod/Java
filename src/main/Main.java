package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
//		Objektai
		Apple x = new Apple();
		Apple y = new Apple();
		
		
//		Metodas: Void
		x.sayColor();
		
		x.saySomething("hello", 30);
		
//		Metodas: Float
		
//		1-as budas
		System.out.println(x.getMass());
		
//		2-as budas
		float mass;
		mass = x.getMass();
		System.out.println(mass);
		
//		Sudetis
		int temp = x.add(15, 30);
		System.out.println(temp);
		
	}
}	