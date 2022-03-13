package maths;

public class PowOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powOfTwo(0));
	}
	
	static boolean powOfTwo(int n) {
		
		if (n == 0) return false;
		
		return (n & (n - 1)) == 0;
	}

}
