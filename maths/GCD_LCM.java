package maths;

//import java.util.ArrayList;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(270, 192));
		System.out.println(lcm(2, 8));

		
	}

	static int gcd(int a, int b) {

		if (a == 0) return b;

		return gcd(b % a, a);
	}

	static int lcm(int a, int b) {

		if (a == 0) return 0;

		if (a == 1) return b;

		return a * b / gcd(a, b);
	}


}
