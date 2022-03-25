package set5;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(60, 130));
	}
	
	static int gcd(int a, int b) {
		
		if (a == 0) return b;
		
		return gcd(b % a, a);
	}

}
