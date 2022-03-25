package set5;

import java.util.Arrays;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 4, 3, 1, 2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void sort(int[] arr) {
		
		boolean swaped;
		for (int i = 0; i < arr.length-1; i++) {
			swaped = false;
			for (int j = 1; j < arr.length-i; j++) {
				if (arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
					swaped = true;
				}
			}
			if (!swaped) break;
		}
	}
	
	static void swap(int[] arr, int f, int s) {
		arr[f] = arr[f] ^ arr[s];
		arr[s] = arr[f] ^ arr[s];
		arr[f] = arr[f] ^ arr[s];
	}

}
