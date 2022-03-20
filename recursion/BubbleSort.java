package recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 3, 2, 5, 1};
		bubbleSort(arr, arr.length, 0);
		System.out.println(Arrays.toString(arr));

	}
	
	static void bubbleSort(int[] arr, int row, int col) {
		
		if (row == 0)
			return;
		
		if (col < row-1) {
			if (arr[col+1] < arr[col])
				swap(arr, col, col+1);
			
			bubbleSort(arr, row, col+1);
		} else {
			bubbleSort(arr, row-1, 0);
		}
		
	}
	
	
	static void swap(int[] arr, int first, int second) {
		arr[first] = arr[first] ^ arr[second];
		arr[second] = arr[first] ^ arr[second];
		arr[first] = arr[first] ^ arr[second];
	}

}
