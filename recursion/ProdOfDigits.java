package recursion;

public class ProdOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = prodOfDigits(304);
		System.out.println(ans);

	}
	
	static int prodOfDigits(int n) {
		
		if (n == 0)
			return 1;
		
		return n % 10 * prodOfDigits(n/10);
	}

}
