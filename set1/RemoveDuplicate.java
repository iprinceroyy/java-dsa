package set1;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, -1, 0, 1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 8};
		removeDuplicate(arr);
	}

	static void removeDuplicate(int[] arr) {

		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];	
			} 
		}

		for (int j = i+1; j < arr.length;j++) {
			arr[j] = 0;
		}	

		System.out.println(Arrays.toString(arr));

	}

}
