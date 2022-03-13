package recursion;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse1(675));
		
	}
	/*
	static int sum = 0;
	static void reverse(int n) {
		
		if(n == 0)
			return;
		
		sum = sum * 10 + n % 10;
		reverse(n/10);
	}*/
	
	static int reverse1(int n) {
		
		int digits = (int)Math.log(10) + 1;
		return helper(n, digits);
	}
	
	static int helper(int n, int digits) {
		
		if (n % 10 == n)
			return n;
		
		return n%10 * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
	}

}
