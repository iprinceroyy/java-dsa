package binary.search;

public class Floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 5, 8, 10, 12};
		int target = 4;
		int ans = floor(arr, target);
		System.out.println(ans);

	}
	
	
	//return the greatest num smaller than or equal to target
	static int floor(int[] arr, int target) {
		
		int start = 0, end = arr.length - 1;
		
		//here we are not considering any7 edge because by default
		//end will be -1 after while terminates
		
		while (start <= end) {
			int mid = start + (end-start)/2;
			
			if (target == arr[mid]) return mid;
			
			if (target < arr[mid]) end = mid - 1;
			
			else start = mid + 1;
		}
		
		return end;
	}

}
