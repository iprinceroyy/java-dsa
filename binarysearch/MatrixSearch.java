package binarysearch;

import java.util.Arrays;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {
			{10, 20, 30, 40},
			{15, 25, 35, 45},
			{28, 29, 37, 49},
			{33, 34, 38, 50}
		};
		
		System.out.println(Arrays.toString(matrixSearch(matrix, 100)));

	}
	
	static int[] matrixSearch(int[][] matrix, int target) {
		
		int row = 0;
		int col = matrix.length - 1;
		
		while (row < matrix.length && col >= 0) {
			
			if (target == matrix[row][col])
				return new int[] {row, col};
			
			if (target > matrix[row][col])   //it means target lies in next row
				row++;
			
			else col--;  //it means in the same row but different col
		}
		
		return new int[]{-1, -1};
	}

}
