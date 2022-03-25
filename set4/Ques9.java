package set4;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1, count = 1;
		while (count <= 10) {
			int i = 1;
			while(i <= 10) {
				if (isPalindrome(j) && isPrime(j)) {
					System.out.print(j + " ");
					i++;
				}
				j++;
			}
			System.out.println();
			
			count++;

		}

	}

	static boolean isPalindrome(int n) {

		StringBuilder s = new StringBuilder(n+"");
		s.reverse();

		return s.toString().equals(n+"");
	}

	static boolean isPrime(int n) {
		
		if (n < 2) return false;
		
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) return false;
			i++;
		}

		return true;
	}

}
