package set2;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		rotateLeft(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void rotateLeft(int[] arr) {
		
		int i = 0;
		int temp = arr[0];
		while (i < arr.length-1) {
			arr[i] = arr[i+1];
			i++;
		}
		arr[i] = temp;
	}
	
	static void swap(int[] arr, int f, int s) {
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}

}
