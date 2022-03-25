package set4;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(5, 7));
	}
	
	static int gcd(int x, int y) {
		
		int ans = 0;
		while (x > 0) {
			if (x > y && x % y == 0) {
				ans = y;
			} else {
				x = x % y;
			}
		}
		
		return ans;
	}

}
