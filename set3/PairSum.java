package set3;

import java.util.*;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		System.out.println(pair(arr, 11));
	}
	
	static int pair(int[] arr, int k){
		
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(k - arr[i]))
				count += hm.get(k - arr[i]);
			
			if (hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i])+1);
			else 
				hm.put(arr[i], 1);
		}
		
		return count;
		
	}

}
