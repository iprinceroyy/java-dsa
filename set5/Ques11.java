package set5;

import java.util.Arrays;

public class Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 18, 6, 3, -1, 0, 4};
		arrange(arr, 6, 0, arr.length-1, false);
		System.out.println(Arrays.toString(arr));

	}

	static void arrange(int[] arr, int element) {

		int start = 0, end = arr.length-1;

		while (start <= end) {
			while (arr[start] < element) {
				start++;
			}
			while (arr[end] > element) 
				end--;

			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++; end--;
			}
		}

	}

	static void arrange(int[] arr, int element, int start, int end, boolean toSwap) {

		if (start >= end) return;
		
		if (toSwap) 
			swap(arr, start, end);

		
		if (arr[start] < element)
			arrange(arr, element, start+1, end, false); 
		
		else if (arr[end] > element)
			arrange(arr, element, start, end-1, false);
		
		else arrange(arr, element, start, end, true);
	}
	
	static void swap(int[] arr, int f, int s) {
		arr[f] = arr[f] ^ arr[s];
		arr[s] = arr[f] ^ arr[s];
		arr[f] = arr[f] ^ arr[s];
	}

}
