package recursion;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 4, 1, 3, 2};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		

	}

	static void quickSort(int[] arr, int low, int high) {
		
		if (low >= high) return;
		
		int start = low;
		int end = high;
		int mid = low + (high-low)/2;
		int pivot = arr[mid];
		
		while (start <= end) {
			
			while (arr[start] < pivot)
				start++;
			
			while (arr[end] > pivot)
				end--;
			
			if (start <= end) {
				swap(arr, start, end);
				start++; end--;
			}
			
		}
		
		
		// pivot is at correct index, now sort left subarray
		// and right sub array
		quickSort(arr, low, end);
		quickSort(arr, start, high);
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
