package set2;

import java.util.*;

public class OneToTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(convert(arr, 2, 3));

	}
	
	static List<List<Integer>> convert(int[] arr, int row, int col){
		
		List<List<Integer>> outer = new ArrayList<>();
		for (int i = 0; i < row; i++) {
			List<Integer> inner = new ArrayList<>();
			for (int j = 0; j < col; j++) {
				inner.add(arr[i*arr.length/row+j]);
			}
			outer.add(inner);
		}
		
		return outer;
	}
	
	

}
