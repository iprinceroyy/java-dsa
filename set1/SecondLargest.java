package set1;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, -1, 2, 10, 8, 4};
		System.out.println(secondLargest(arr));

	}

	static int secondLargest(int[] arr) {
		
		int first = arr[0];
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}
		}
		
		return second;
	}
}
