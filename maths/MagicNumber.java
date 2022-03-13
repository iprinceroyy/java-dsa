package maths;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(magicNum(6));
		// time complexity = O(logN)
	}
	
	static int magicNum(int n) {
		
		int ans = 0, base = 5;
		while (n > 0) {
			int last = n & 1;
			n = n >> 1;
			ans += base * last;
			base *= 5;
		}
		
		return ans;
	}

}
