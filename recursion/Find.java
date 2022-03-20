package recursion;

import java.util.ArrayList;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, -2, 8, 22,8};
		System.out.println(findIndex(arr, 8, 0));
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(findAllIndex(arr, 8, 0, list));

	}

	static boolean find(int[] arr, int target, int index) {

		if (index == arr.length)
			return false;
		
		return arr[index] == target || find(arr, target, ++index);
	}
	
	static int findIndex(int[] arr, int target, int index) {
		
		if (index == arr.length)
			return -1;
		
		if (arr[index] == target)
			return index;
		return findIndex(arr, target, ++index);
		
	}
	
	
	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
		
		if (index == arr.length) {
			return list;
		}
		
		if (arr[index] == target) {
			list.add(index);
		}
		
		return findAllIndex(arr, target, ++index, list);
	}

}
