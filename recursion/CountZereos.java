package recursion;

public class CountZereos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(1000000000));

	}
	
	static int count(int n) {
		
		int count = helper(n, 0);
		return count;
	}
	
	static int helper(int n, int count) {
		
		if (n == 0)
			return count;
		
		if (n % 10 == 0)
			return helper(n/10, ++count);
		
		return helper(n/10, count);
	}

}
