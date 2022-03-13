package binary.search;

public class RotationCountBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr1 = { 4, 5, 1, 2, 3 };
		int[] arr = {1, 3, 5, 7, 10 , 12};
		int res = countRotation(arr);
		System.out.println(res);

	}

	static int countRotation(int[] arr) {
		return RotatedBinarySearch.pivotIndex(arr) + 1;

	}

	//pivot with duplicates
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

			//if elements at start, mid end are same, just skip duplicates
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

				//if first element is pivot
				if (arr[start] > arr[start + 1]) 
					return start;
				start++; //else start++

				if (arr[end] < arr[end - 1]) //if last element is pivot
					return end - 1;
				end--; //else end++
			}

			//left side is sorted, so pivot should be in right
			else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;
	}

}
