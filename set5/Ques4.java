package set5;

import java.util.*;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
		int[] ans = eliminate(arr);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] eliminateDuplicates(int[] arr) {
		
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		
		int[] temp = new int[i+1];
		for (int j = 0; j < i+1; j++) {
			temp[j] = arr[j];
 		}
		//System.out.println(Arrays.toString(arr));
		return temp;
	}
	
	static int[] eliminate(int[] arr) {
		
		Set<Integer> hs = new HashSet<>();
		for (int i: arr) {
			hs.add(i);
		}
		
		//Integer[] a = new Integer[hs.size()];
		int[] temp = new int[hs.size()];
		Iterator<Integer> it = hs.iterator();
		int i = 0;
		while (it.hasNext()) {
			temp[i] = it.next();
			i++;
		}
		
		return temp;
		
	}

}
