package maths;

public class RangeXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xor(6));
		System.out.println(rangeXOR(2, 8));
	}

	// xor from 0 to a
	static int xor(int a) {

		if (a % 4 == 0)
			return a;

		if (a % 4 == 1)
			return 1;

		if (a % 4 == 2)
			return a+1;

		return 0;
	}
	
	// xor from a to b
	static int rangeXOR(int a, int b) {
		
		return xor(b) ^ xor(a-1);
	}

}
