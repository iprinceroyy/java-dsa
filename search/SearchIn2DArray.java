package search;

import java.util.*;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{23, 56},
				{90},
				{45, 78, -90}
		};

		int target = 78;
		int[] ans = searchIn2D(arr, target);
		System.out.println(Arrays.toString(ans));


	}

	//index search
	static int[] searchIn2D(int[][] arr, int target) {

		for (int row = 1; row < arr.length; row++) {
			for ( int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) 
					return new int[] {row,col}; //it will return row and col of target element

			}
		}

		return null;
	}

}
