package set4;

import java.util.*;

public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(insert(arr, 50, 5)));
	}
	
	static int[] insert(int[] arr, int n, int pos) {
		
		int[] newArr = new int[arr.length+1];
		
		for (int i = 0; i < newArr.length; i++) {
			if (i < pos-1)
				newArr[i] = arr[i];
			else if (i == pos-1)
				newArr[i] = n;
			else
				newArr[i] = arr[i-1];
		}
		
		return newArr;
	}

}
