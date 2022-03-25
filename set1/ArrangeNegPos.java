package set1;

import java.util.Arrays;

public class ArrangeNegPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3, 4, -1, -2, 9, 10, 0};
		rearrange(arr);
		
	}
	
	static void rearrange(int[] arr) {
		
		int i = 0, j = arr.length-1;
		while (i <= j) {
			if (arr[i] < 0)
				i++;
			else swap(arr, i, j); j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int f, int s) {
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}

}
