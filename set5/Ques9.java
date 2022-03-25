package set5;

import java.util.Arrays;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 4, 3, 1, 2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {

		int min;
		for (int i = 0; i < arr.length-1; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i)
				swap(arr, min, i);
		}
	}

	static void swap(int[] arr, int f, int s) {
		arr[f] = arr[f] ^ arr[s];
		arr[s] = arr[f] ^ arr[s];
		arr[f] = arr[f] ^ arr[s];
	}


}
