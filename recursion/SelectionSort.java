package recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 4, 3, -1, 2, 0, 1};
		selectionSort(arr, arr.length, 0, 0);
		System.out.println(Arrays.toString(arr));

	}
	
	static void selectionSort(int[] arr, int row, int col, int max) {
		
		if (row == 1)
			return;
		
		if (col < row) {
			if (arr[col] > arr[max]) {
				selectionSort(arr, row, col+1, col);
			} else {
				selectionSort(arr, row, col+1, max);
			}
		} else {
			swap(arr, row-1, max);
			selectionSort(arr, row-1, 0, 0);
		}
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
