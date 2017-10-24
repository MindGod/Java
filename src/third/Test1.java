package third;

import java.util.Scanner;

public class Test1 {
	
	Scanner input = new Scanner(System.in);
	
	boolean ar_skani = true;
	float mass;
	
	
	
	public Test1( float pear_mass){
		mass = pear_mass;
		
		if (mass > 0.5f) {
			ar_skani = true;
		} else {
			ar_skani = false;
		}
	}
	
	void saySomething() {
		if (ar_skani == true) {
			System.out.println("skani");
		} else {
			System.out.println("neskani");
		}
		
	}

}
