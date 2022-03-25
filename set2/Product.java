package set2;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(product(123, 234));
	}
	
	
	static int product(int m, int n) {
		
		int ans = 0;
		
		int place = 1;
		while (n > 0) {
			ans += m * (n % 10 * place);
			System.out.println(n % 10 * place);
			n /= 10;
			place *= 10;
		}
		
		return ans;
	}

}
