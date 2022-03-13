package maths;

import java.util.Arrays;

public class FliplingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 9, 12, -9};
		
		int[][] arr1 = {
				{1,1,0},
				{1,0,1},
				{0,0,0}
		};
		flipAndInvert(arr1);
		for(int[] subarr: arr1)
			System.out.println(Arrays.toString(subarr));
		
		

	}
	
	static void flipAndInvert(int[][] arr) {
		
		for (int[] subarr: arr) {
			reverseAndInvert(subarr);
		}
		
	}
	
	static void reverseAndInvert(int[] arr) {
		
		int start = 0, end = arr.length - 1;
		
		while (start <= end) {
			int temp = arr[start] ^ 1;
			arr[start] = arr[end] ^ 1;
			arr[end] = temp;
			start++; end--;
		}
		
	}

}
