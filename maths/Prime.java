package maths;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(13));
	}
	
	static boolean isPrime(int n) {
		
		if (n <= 1)
			return false;
		
		int c = 2;
		while (c * c < n) {
			if (n % c == 0)
				return false;
			c++;
		}
		return true;
	}
}
