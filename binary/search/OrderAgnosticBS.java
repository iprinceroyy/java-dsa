package binary.search;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {89, 56, 5, 3, -2};
		
		int key = 89;
		
		int res = orderAgnosticBS(arr, key);
		System.out.println(res);
		

	}
	
	static int orderAgnosticBS(int[] arr, int target) {
		
		int start = 0, end = arr.length-1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while (start <= end) {
			int mid = start + (end-start)/2;
			
			if (arr[mid] == target) return mid;
			
			if (isAsc) {
				if (target < arr[mid]) end = mid - 1;
				
				else start = mid + 1;
				
			} else {
				if (target < arr[mid]) start = mid + 1;
				
				else end = mid - 1;;
			}
		}
		
		return -1;
	}

}
