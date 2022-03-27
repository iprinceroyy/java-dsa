package binarysearch;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1};
		int target = 0;
		System.out.println(search(arr, target));
	}


	static int search(int[] nums, int target) {
		
		int pivot = pivotIndex(nums);

		//if there is no pivot then normal binary search
		if (pivot == -1)
			return binarySearch(nums, target, 0, nums.length-1);

		//if pivot is target then return index of pivot
		if (nums[pivot] == target)
			return pivot;


		//if target greater than start, search in left sub array
		if (target >= nums[0])
			return binarySearch(nums, target, 0, pivot - 1);

		//if target is smaller than start, search in right sub array
		return binarySearch(nums, target, pivot + 1, nums.length-1);

	}


	//index of pivot element
	static int pivotIndex(int[] arr) {
		int start = 0, end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start)/2;

			//if mid is greater than right side sub array 
			if (mid < end && arr[mid] > arr[mid + 1]) 
				return mid;

			//if mid is less than left sub array
			if (mid > start && arr[mid] < arr[mid - 1])
				return mid - 1;

			if (arr[mid] <= arr[start]) 
				end = mid - 1;
			else start = mid + 1;

		}

		return -1;
	}


	static int binarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {
			int mid = start + (end-start)/2;

			if (arr[mid] == target)
				return mid;

			if (target < arr[mid])
				end = mid - 1;
			else start = mid + 1;
		}

		return -1;
	}

}
