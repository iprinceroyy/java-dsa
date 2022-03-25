package set2;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(17));
	}
	
	static String isPrime(int n) {
		
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0)
				return "Not Prime";
			i++;
		}
		
		return "Prime";
	}

}
