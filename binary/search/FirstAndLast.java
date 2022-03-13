package binary.search;

import java.util.Arrays;

public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,7,8,8,10};
		int[] ans = searchRange(arr, 8);
		System.out.println(Arrays.toString(ans));

	}


	//	static int[] searchRange(int[] nums, int target) {
	//		int[] ans = {-1, -1};
	//		
	//		int start = search(nums, target, true);
	//		int end = search(nums, target, false);
	//		
	//		ans[0] = start;
	//		ans[1] = end;
	//		
	//		return ans;
	//	}


	//brute force
	static int[] searchRange(int[] nums, int target) {

		int n = nums.length - 1;
		int[] res = new int[2];

		for (int i = 0, j = n; i < j; i++, j--) {
			if (nums[i] == target) {
				if (nums[j] == target) {
					break;
				}
		}
		res[0] = i;
		res[1] = j;
	}
	return res;
}



static int search(int[] arr, int target, boolean firstStartIndex) {

	int ans = -1;
	int start = 0, end = arr.length - 1;

	while (start <= end) {

		int mid = start + (end-start)/2;

		if (target < arr[mid])
			end = mid - 1;

		else if (target > arr[mid]) 
			start = mid + 1;

		else {
			ans = mid;
			if (firstStartIndex) 
				end = mid - 1;
			else start = mid + 1;
		}
	}

	return ans;

}

}
