package set1;

import java.util.*;

public class FormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPossible(22423));
	}
	
	static int isPossible(int n) {
		
		int num1 = n;
		
		int count = 0;
		while (n > 0) {
			count ^= n%10;
			n /= 10;
		}
		
		int noOfDigits = (int)(Math.log(num1)/Math.log(10)) + 1;
		if ((noOfDigits % 2 == 0 && count==0) || (noOfDigits % 2 != 0 && count != 0))
			return 2;
		
		return 1;

	}

	

}
