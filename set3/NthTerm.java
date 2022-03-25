package set3;

public class NthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(nextPrime(40));
		//System.out.println(nextPrime(42));
		System.out.println(nextOdd(4));
		
	}

	static boolean isOdd(int n) {

		return (n&1) == 1;
	}
	
	static int nextOdd(int n) {
		
		if ((n&1) == 0) return n+1;
		return n+2;
	}

	static boolean isPrime(int n) {

		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) 
				return false;
			i++;
		}

		return true;
	}

	static int nextPrime(int n) {

		int prime = n;
		while (true) {
			prime++;
			if(isPrime(prime)) {
				break;
			}
		}
		return prime;
	}
	
	static boolean isPerfectSq(int n) {
		
		int x = (int)Math.sqrt(n); 
		return x * x == n;
	}
}
