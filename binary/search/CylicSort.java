package binary.search;

import java.util.Arrays;

public class CylicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 5, 2, 1, 4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void cyclicSort(int[] arr) {
		
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex])
				swap(arr, i, correctIndex);
			else
				i++;
		}
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
