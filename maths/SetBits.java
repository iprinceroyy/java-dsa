package maths;

public class SetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45567;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(setBits(n));
		System.out.println((int)(Math.log(45567)/Math.log(10)) + 1);

	}

	static int setBits(int n) {

		int count = 0;

		while (n > 0) {
			count++;
			n = n & (n - 1);

		}

		return count;
	}

}
