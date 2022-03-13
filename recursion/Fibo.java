package recursion;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fibo(4);
		System.out.println(ans);
	}
	
	public static int fibo(int n) {
		
		if (n == 0 || n == 1)
			return n;
		
		return fibo(n-1) + fibo(n-2);
	}

}
