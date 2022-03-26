package set1;

public class DivisibleByNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDivisible(123456));
	}
	
	static boolean isDivisible(int n) {
		
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum % 9 == 0;
	}

}
