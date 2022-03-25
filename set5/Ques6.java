package set5;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 56, 89, 91};
		System.out.println(search(arr, 2, 0, arr.length-1));

	}

	static int search(int[] arr, int target, int start, int end) {
		
		if (start > end) return -1;
		
		int mid = start + (end-start)/2;

		if (arr[mid] == target) return mid;

		if (target < arr[mid])
			return search(arr, target, start, mid-1);
		
		return search(arr, target, mid+1, end);

	}

}
