package set3;

import java.util.*;

public class RemoveFindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, 2, 4, 5, 6};
		System.out.println(removeIndex(arr, 5));

	}

	static List<Integer> removeIndex(int[] arr, int target) {

		ArrayList<Integer> list = new ArrayList<>();
		
		for (int e: arr)
			list.add(e);

		int start = 0, end = arr.length-1;

		while (start <= end) {
			int mid = start + (end-start)/2;

			if (target > list.get(mid))
				start = mid + 1;

			else if (target < list.get(mid)) 
				end = mid - 1;
			
			else {
				list.remove(list.get(mid));
			}

		}
		
		return list;
	}

}
