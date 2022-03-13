package maths;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 7));
	}
	
	static int power(int a, int b) {
		
		int ans = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				ans *= a;
			}
			b = b >> 1;
			a *= a;
			
		}
		return ans;
	}

}
