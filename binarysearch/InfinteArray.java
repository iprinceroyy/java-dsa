package binarysearch;

public class InfinteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 8, 12, 23, 35, 67, 89, 100, 140, 200, 300, 350, 560};
		int target = 560;
		
		System.out.println(searchInInfinte(arr, target));

	}
	
	static int searchInInfinte(int[] arr, int target) {
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			try {
				int newStart = end + 1;
				end = end + (end - start + 1) * 2; //prev end + 2*length of box
				start = newStart;
			} catch (Exception e) {
				System.out.println("Opps! Target element is close to end element");
			}
			
		}
		
		return binarySearch(arr, target, start, end);
	}


	static int binarySearch(int[] arr, int key, int start, int end) {

		if (start > end) return -1;

		int mid = start+(end-start)/2;  //if start is lower than than calculate mid

		if (arr[mid] == key) return mid;

		if (key > arr[mid]) 
			return binarySearch(arr, key, mid+1, end);

		return binarySearch(arr, key, start, mid-1);

	}

}
