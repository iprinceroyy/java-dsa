package binary.search;

public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 7, 9, 10, 14, 16, 17, 18};
		int target = 3;
		int ans = ceiling(arr, target);
		System.out.println(ans);

	}
	
	
	//return the smallest element greater than or equal to target
	static int ceiling(int[] arr, int target) {
		
		int start = 0, end = arr.length - 1;
		
		if (target > arr[arr.length - 1]) //if target element is itself the greatest
			return -1;
		
		while (start <= end) {
			int mid = start + (end-start)/2;
			
			if (arr[mid] == target) return mid;
			
			if (target < arr[mid]) end = mid - 1;
			
			else start = mid + 1;
		}
		
		return start;   
		//if while loop gets terminated without returning any ans
		//at the end start element will be at position greater than target
	}

}
