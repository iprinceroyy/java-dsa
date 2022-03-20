package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = sumOfDigits(771);
		System.out.println(ans);
	}
	
	static int sumOfDigits(int n) {
		
		if (n == 0) 
			return 0;
		
		return n%10 + sumOfDigits(n/10);
	}

}
