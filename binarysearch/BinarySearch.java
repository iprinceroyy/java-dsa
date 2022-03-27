package binarysearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-90, -9, 0, 3, 56, 89};
		Arrays.sort(arr);
		
		int key = 89;
		int start = 0, end = arr.length-1;
		
		int res = binarySearch(arr, key, start, end);
		System.out.println(res);
		

	}
	
	
	//recursive binary search
	static int binarySearch(int[] arr, int key, int start, int end) {
		
		if (start > end) return -1;
		
		int mid = start+(end-start)/2;  //if start is lower than than calculate mid
		
		if (arr[mid] == key) return mid;
		
		if (key > arr[mid]) 
			return binarySearch(arr, key, mid+1, end);
		
		return binarySearch(arr, key, start, mid-1);
		
	}
	
	
	//iterative binary search
//	static int binarySearch(int[] arr, int target) {
//		
//		int start = 0;
//		int end = arr.length-1;
//		
//		while (start <= end ) {
//			int mid = start + (end-start)/2;
//			
//			if (target == arr[mid]) return mid;
//			
//			else if (target < arr[mid]) 
//				end = mid-1;
//			
//			else start = mid + 1;
//		}
//		
//		return -1;
//	}

}
