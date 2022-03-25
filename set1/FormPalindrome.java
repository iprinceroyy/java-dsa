package set1;

import java.util.Arrays;

public class FormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPossible(125131213));
		

	}

	static int isPossible(int n) {

		String str = "" + n;
		char[] arr = str.toCharArray();  //space: O(n)

		int i = 0, end = arr.length-1;
		for (int j = 1; i < arr.length && j < arr.length; j++) { //time: O(n)
			if (arr[i] == arr[j]) {
				char temp = arr[j];
				arr[j] = arr[end];
				arr[end] = temp;
				i++; end--;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));

		return isPalindrome(arr)? 2: 1;	  //timeO(n)
	}

	static boolean isPalindrome(char[] arr) {

		int start = 0, end = arr.length-1;
		while (start <= end) {
			if (arr[start] != arr[end])
				return false;
			start++; end--;
		}
		return true;
	}
	

}
