package set3;

import java.util.*;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {21, 34, 41, 22, 35};
		int[] arr2 = {61, 34, 45, 21, 11};
		intersection(arr1, arr2);

	}
	
	static void intersection(int[] a, int[] b) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			if (hs.contains(b[i])) {
				System.out.println(b[i]);
			}
		}
		
	}

}
